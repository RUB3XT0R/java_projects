package autootimizadorv3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public final class Automato {

    private String nome;
    private Estado inicial;
    private char[] alfabeto;
    private ArrayList<Estado> estados = new ArrayList<>();

    public Automato() {
    }

    public Automato(String automato) {
        Matcher m;
        //** estudo do alfabeto em modo texto **//
        m = Pattern.compile("\\{([a-z]|,)*\\}").matcher(automato);  //captura {a,b,c...}
        String simbolos = m.find() ? m.group().replaceAll("\\{|\\}|,", "") : "E";
        setAlfabeto(simbolos.toCharArray());

        //** estudo dos estados em modo texto **//
        m = Pattern.compile("[m|M][1-9]=").matcher(automato); //captura M1=
        nome = m.find() ? m.group().replaceAll("\\{|\\}|,|=", "") : "M";
        m = Pattern.compile("[m|M][1-9]=\\(\\{(q[0-9]*|,)*\\}").matcher(automato);          //captura M1={q0,q1,q2,q3,...}
        m = Pattern.compile("q[0-9]*").matcher(m.find() ? m.group() : "");   //captura os estados
        while (m.find()) {
            addEstado(m.group());
        }

        //** estudo das transições em modo texto **//
        //captura: (q0,b) = q2 ou (q0,E) = {q2,q3}
        m = Pattern.compile("\\(q[0-9]*,([a-z]|E)\\)=\\{?(q[0-9]*|,){1,}\\}?").matcher(automato);
        String estadoOrigem = "", simbolo = "", transicao;
        String[] estadosDestinos = {""};
        Matcher subm;
        while (m.find()) {
            transicao = m.group(); //(qu,a)={qv,qn,qm,...}
            subm = Pattern.compile("\\(q[0-9]*,").matcher(transicao); //captura o estado origem
            while (subm.find()) {
                estadoOrigem = subm.group().replaceAll("\\(|,", "");
            }
            subm = Pattern.compile("([a-z]|E)\\)").matcher(transicao); //captura o estado origem
            while (subm.find()) {
                simbolo = subm.group().replaceAll("\\)", "");
            }
            subm = Pattern.compile("=\\{?(q[0-9]*|,){1,}\\}?").matcher(transicao); //captura o estado origem
            while (subm.find()) {
                estadosDestinos = subm.group().replaceAll("\\)|=|\\{|\\}", "").split(",");
            }
            newTransicao(estadoOrigem, simbolo, estadosDestinos);
        }

        //** estudo dos estados finais em modo texto **//
        m = Pattern.compile("\\{(q[0-9]*|,)*\\}\\)").matcher(automato);          //captura {q2,q3})
        m = Pattern.compile("q[0-9]*").matcher(m.find() ? m.group() : "");   //captura os estados finais
        while (m.find()) {
            turnFinal(m.group());
        }


        //** estudo do estado inicial em modo texto **//
        m = Pattern.compile(",\\{q[0-9]*\\},").matcher(automato);          //captura {q0})
        while (m.find()) {
            setInicial(m.group().replaceAll("\\{|\\}|,", ""));
        }

    }

    public void addEstado(String nome) {
        Estado e = new Estado(nome);
        if (estados.contains(e)) {
            return; //verifica se o estado j_ existe
        }
        estados.add(e); //adiciona novo estado
    }

    public boolean isInicial(Estado e) {
        return inicial.equals(e);
    }

    public void turnFinal(String nome) {
        estados.get(estados.indexOf(new Estado(nome))).setFinal(true);
    }

    public void setInicial(String nome) {
        inicial = estados.get(estados.indexOf(new Estado(nome)));
    }

    public boolean newTransicao(String estadoOrigem, String simbolo, String... estadosDestinos) {
        //verifica se existem os parametros
        if ("".equals(estadoOrigem) || "".equals(simbolo) || estadosDestinos.length < 1) {
            return false;
        }
        //verifica se o simbolo é vazio(E) ou pertençe ao alfabeto, caso contrario não adiciona a transição
        boolean pertence = true;
        char simbol = simbolo.charAt(0);
        for (char a : alfabeto) {
            if (simbol == a || simbol == 'E') {
                pertence = true;
                break;
            }
        }
        if (!pertence) {
            return false;
        }

        //captura do estado de origem
        Estado e = estados.get(estados.indexOf(new Estado(estadoOrigem)));
        if (e == null) {
            return false;
        }
        //Caso já exista a transição com o simbolo,
        //o(s) estado(s) e(são) adicionado(s) a lista
        Estado ad;
        int i;
        if (e.transicoes.containsKey(simbol)) {
            for (String est : estadosDestinos) {
                i = estados.indexOf(new Estado(est));
                if (i == -1) {
                    continue;
                }
                ad = estados.get(i);
                if (e.transicoes.get(simbol).contains(ad)) {
                    continue;
                }
                e.transicoes.get(simbol).add(ad);
            }
        } else {
            //caso não exista, uma lista de estados é criada e inserida a nova transição
            ArrayList<Estado> listadestinos = new ArrayList<>();
            for (String est : estadosDestinos) {
                i = estados.indexOf(new Estado(est));
                if (i == -1) {
                    continue;
                }
                ad = estados.get(i);
                listadestinos.add(ad);
            }
            if (listadestinos.isEmpty()) {
                return false;
            }
            e.transicoes.put(simbol, listadestinos);
        }
        return true;
    }

    public void eliminarTransicoesEmVazio() {
        //percorre cada estado do automato
        for (Estado q : estados) {
            //se contem uma trasi__o em vazio (caracter 'E')
            if (q.transicoes.containsKey('E')) {
                //capturo a lista de estados destinos dessa transi__o
                ArrayList<Estado> listadestinos = q.transicoes.get('E');
                //para cada estado destino dessa transi__o, eu vou copiar as transi__es
                for (Estado destino : listadestinos) {
                    for (char c : destino.transicoes.keySet()) //para cada estado da transi__o em quest_o, 
                    //crio uma transi__o nova para o estado q , mantenho o simbolo c, com o novo estado
                    {
                        for (Estado est : destino.transicoes.get(c)) {
                            newTransicao(q.getNome(), c + "", est.getNome());
                        }
                    }
                }
                q.transicoes.remove('E'); //ao final removo a transi__o em vazio
            }
        }
    }

    private void eliminarNaoDeterminismo() {
        ArrayList<Estado> transNovo = new ArrayList<>();
        Estado Qnovo, q;

        //percorre cada estado do automato
        //OBS.: N_o foi utilizado a itera__o foreach devido a altera__o da cole__o
        //que cria outro estado e gere um erro de concorrencia
        for (int i = 0; i < estados.size(); i++) {
            q = estados.get(i);
            //para todas as transi__es, capturo a lista de estados
            for (char chave : q.transicoes.keySet()) {
                transNovo = q.transicoes.get(chave);
                //se o tamanho da lista de transi__es for maior que 1 existe n_o-determinismo
                if (transNovo.size() > 1) {
                    Qnovo = new Estado("q" + estados.size()); //_ criado um novo estado
                    estados.add(Qnovo); //esse estado pe adicionado a lista
                    //para cada estado da transi__o em quest_o, 
                    //para cada estado destino, copiam-se suas transi__es para o novo estado.
                    for (Estado destino : transNovo) {
                        if (destino.isFinal()) {
                            Qnovo.setFinal(true); //basta um dos estados serem finais para o novo estado tambem ser.
                        }
                        for (char c : destino.transicoes.keySet()) {
                            for (Estado est : destino.transicoes.get(c)) {
                                newTransicao(Qnovo.getNome(), c + "", est.getNome());
                            }
                        }
                    }
                    //ao final troco a referencia a todos os estados da lista para o novo estado.
                    transNovo.clear();
                    transNovo.add(Qnovo);
                }
            }
        }
    }

    private void eliminarEstadosInacessiveis() {
        elEInac(inicial); //fun__o que percorre recursivamente o 'grafo' inciando pelo estad inicial
        deletarEstadosInvalidos(); //ap_s a identifica__o dos estados inacessiveis: considerado=false
    }

    private void elEInac(Estado atual) {
        if (atual.isConsideracao()) {
            return;
        }
        atual.setConsideracao(true); //todo estado a ser analizado é acessivel, pois teve referencia de outro que chamou a função
        System.out.println(" - " + atual + " é Acessivel");
        ArrayList<Estado> lista;
        //para cada transição, captura a lista de estados "que na teoria e pr_tica ter_ apenas um estado" (AFD)
        for (char c : atual.transicoes.keySet()) {
            lista = atual.transicoes.get(c);
            for (Estado e : lista) {
                elEInac(e); //cada estado dessa transição (um apenas, devido ao algoritmo anterior) será marcado e analizado
            }
        }
    }

    private void eliminarEstadosInuteis() {
        for (Estado e : estados) //com quase o mesmo principio do anterior, a itera__o varre e procura apenas os estados finais
        {
            if (e.isFinal()) {
                elEInut(e); //esses n_o considerados uteis, e um itera__o _ feita para se decobrir os estados que levam a eles
            }
        }
        deletarEstadosInvalidos(); //ap_s a identifica__o dos estados inuteis, eles s_o deletados
    }

    private void elEInut(Estado atual) {
        if (atual.isConsideracao()) {
            return;
        }
        atual.setConsideracao(true); //todo estado a ser analizado é acessivel, pois teve referencia de outro que chamou a função
        System.out.println(" - " + atual + " é útil");
        for (Estado e : estados) { //percorre os estados em busca de referencias ao estado atual.
            if (e.equals(atual) || e.isConsideracao()) {
                continue; //despreza se for o atual ou já considerado
            }
            for (char c : e.transicoes.keySet()) { //para cada transição
                // verifica se a lista de cada transição contem o estado, senão tiver, passa para a proxima
                if (e.transicoes.get(c).contains(atual)) {
                    //senao for inicial..continua a procura recursivamente, até chegar no estado inicial.
                    //demonstrando que n_o somente _ util, como acessivel.
                    if (!inicial.equals(e)) {
                        elEInut(e);
                    }
                    e.setConsideracao(true); //uma vez que se mostrou util, _ marcado.
                    break; //a itera__o  para, posi n_o h_ mais necessidade de percorrer as transi__es, uma vez que o estado j_ _ util.
                }
            }
        }
        atual.setConsideracao(true); //por ultimo, o estado atual _ marcado como util.
    }

    private void deletarEstadosInvalidos() {
        //percorre os estado, o uso de um contador ao inves da itera__o for each, se baseia na mesma razao do algotitmo de elimina__o
        //de n_o determinismo
        for (int i = 0; i < estados.size(); i++) {
            Estado e = estados.get(i); //captura o estado atual
            if (e.isConsideracao()) {
                continue; //se for considerado util ou acessivel, ignora as instrutl_es e vai ao proximo;
            }
            for (Estado ee : estados) //inicia-se a busca, em cada estado por referencias/transsi__es que o contenha
            {
                for (char c : ee.transicoes.keySet()) //cas encontre alguma transição a esse estado a ser deletado, ela _ removida
                {
                    if (ee.transicoes.get(c).contains(e)) {
                        ee.transicoes.get(c).remove(e);
                    }
                }
            }
            estados.remove(i); //somente apos remover as referencias do estado, _ possivel removelo com seguran_a.
        }
        try{
        //apos as remo__es, uma nova itera__o _ feita ara remover transi__es vazias (que ficaram se referencia a nenhum estado)
        for (int i = 0; i < estados.size(); i++) {
            Estado e = estados.get(i); //captura o estado atual
            e.setConsideracao(false);	//os estados n_o desmarcados para execu__o de um proximo algoritmo.
            //como n_o ser_ acrescentado nenhuma tarsni__o,o estado dessa pode ser guardado 
            //para controlar a itera__o
             Set<Character> cs = e.transicoes.keySet();
            for (char c : cs) //para cada transi__o, se esta estiver vazia, _ removida.
            {
                if (e.transicoes.get(c).isEmpty()) {
                    e.transicoes.remove(c);
                }
            }
        }
        }catch(Exception e){
            
        }
    }

    public void deletarEstado(String nome) {
        for (int i = 0; i < estados.size(); i++) {
            Estado e = estados.get(i); //captura o estado atual
            if (!e.getNome().equals(nome)) {
                continue; //se n_o for o estado ignora tudo
            }
            for (Estado ee : estados) //inicia-se a busca, em cada estado por referencias/transsi__es que o contenha
            {
                for (char c : ee.transicoes.keySet()) //cas encontre alguma transi__o a esse estado a ser deletado, ela _ removida
                {
                    if (ee.transicoes.get(c).contains(e)) {
                        ee.transicoes.get(c).remove(e);
                    }
                }
            }
            estados.remove(i); //somente apos remover as referencias do estado, _ possivel removelo com seguran_a.
        }
        //apos as remo__es, uma nova itera__o _ feita ara remover transi__es vazias (que ficaram se referencia a nenhum estado)
        for (Estado e : estados) {
            Set<Character> cs = e.transicoes.keySet();
            for (char c : cs) //para cada transi__o, se esta estiver vazia, _ removida.
            {
                if (e.transicoes.get(c).isEmpty()) {
                    e.transicoes.remove(c);
                }
            }
        }
    }

    protected class Classe {

        protected boolean marcada;
        protected List<ParEq> pares = new ArrayList<>();

        protected void addPar(Estado q1, Estado q2) {
            if(marcada)return;
            ParEq pe = new ParEq(q1, q2);
            ParEq peInv = new ParEq(q2, q1);
            if (pares.contains(pe) || pares.contains(peInv)) return;
            pares.add(pe);
        }
        
        protected void marcar(){
            marcada=true;
            pares.clear();
        }
        
    }

    protected class ParEq {

        protected Estado q1;
        protected Estado q2;

        protected ParEq(Estado q1, Estado q2) {
            this.q1 = q1;
            this.q2 = q2;
        }

        @Override
        public String toString() {
            return "{" + q1 + "," + q2 + '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final ParEq other = (ParEq) obj;
            if (!Objects.equals(this.q1, other.q1)) {
                return false;
            }
            if (!Objects.equals(this.q2, other.q2)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 97 * hash + Objects.hashCode(this.q1);
            hash = 97 * hash + Objects.hashCode(this.q2);
            return hash;
        }
        
        
    }
    int tam;
    private Classe[][] classes;

    private void minimizando() {
        int tam = estados.size() - 1;
        classes = new Classe[tam][tam];
        //marcando os pares trivialmente não equivalentes
        for (int i = 0; i < tam; i++) {
            for (int y = 0; y < tam; y++) { //para cada coluna (relação de pares)
                classes[i][y] = new Classe();
                if ((i + 1) <= y) {
                    classes[i][y].marcada = true; //ajuste da diagonal principal
                }                //caso ambos sejam finais ou não finais, são potencialemnte equivalentes, e não serão marcados
                if ((estados.get(i + 1).isFinal() && estados.get(y).isFinal()) //se ambos forem finais
                        || (!estados.get(i + 1).isFinal() && !estados.get(y).isFinal())) //se ambos forem não finais
                {
                    continue; //pula para não marcar os estados
                }                //se um for final e o outro não, não são potencialmente equivalentes e serão marcados.
                classes[i][y].marcada = true;
            }
        }
        System.out.println("---- Iniciando o algoritmo de Minimização ----");
        System.out.println("-- 1ª fase: Classes de equivalencia --");
        mostraClasses();
        System.out.println("-- 2ª fase: Análise dos pares --");
        for (int i = 0; i < tam; i++) { //para cada coluna (relação de pares)
            for (int y = 0; y < tam; y++) {
                if (classes[y][i].marcada) {
                    continue; //se for uma relação marcada, pula
                }
                Estado qu = estados.get(i); //captura o estado qu
                Estado qv = estados.get(y + 1);   //captura o estado qv
                System.out.println("-- a) par {" + qu + "," + qv + "}");
                //para cada transição de qv, vejo se qu tem uma transição com o mesmo simbolo
                for (char a : qv.transicoes.keySet()) {
                    //se houve uma transição para esse estado
                    if (qu.transicoes.keySet().contains(a)) {
                        if(qu.transicoes.get(a).isEmpty()) continue;
                        Estado pu = qu.transicoes.get(a).get(0); //captura o estado destino pu
                        if(qv.transicoes.get(a).isEmpty()) continue;
                        Estado pv = qv.transicoes.get(a).get(0); //captura o estado destino pv
                        System.out.println("-- G(" + qu + "," + a + ")=" + pu + " e G(" + qv + "," + a + ")=" + pv + ";");

                        //Se pu=pv, então
                        if (pu.equals(pv)) {
                            System.out.println("-- " + pu + "=" + pv + ":");
                            //qu é equivalente a qv para o simbolo a e não deve ser marcado
                            System.out.println("-- " + qu + " é equivalente a " + qv + " para " + a + " e não deve ser marcado;");
                            continue;
                        }
                        //se pu!= pv, então
                        System.out.println("-- " + pu + "!=" + pv + ":");

                        boolean marcado;
                        if (pv.getIndex() < pu.getIndex()) {
                            marcado = classes[estados.indexOf(pu) - 1][estados.indexOf(pv)].marcada;
                        } else {
                            marcado = classes[estados.indexOf(pv) - 1][estados.indexOf(pu)].marcada;
                        }

                        if (!marcado) {
                            //se pu!=pv e o par {pu,pv) não está marcado
                            System.out.println("-- {" + pu + "," + pv + "} não está marcado,");
                            //{qu,qy} é incluido em uma lista a partir de {pu,pv} para posterior analise
                            if (pv.getIndex() > pu.getIndex()) {
                                classes[estados.indexOf(pv) - 1][estados.indexOf(pu)].addPar(qv, qu);
                            } else {
                                classes[estados.indexOf(pu) - 1][estados.indexOf(pv)].addPar(qu, qv);
                            }
                            System.out.println("-- {" + qu + "," + qv + "} é incluido em uma lista a partir de"
                                    + " " + pu + "," + pv + "} para posterior analise.");
                            continue;
                        } else {
                            //se pu!=pv e o par {pu,pv) está marcado
                            System.out.println("-- {" + pu + "," + pv + "} está marcado,");
                            //{qu,qy} não é equivalente e deve ser marcado
                            System.out.println("-- {" + qu + "," + qv + "} deve ser marcado.");
                            marcarEncabecado(qu, qv);
                            marcarEncabecado(qv, qu);
                            continue;
                        }
                    }
                }
            mostraClasses();
            }
        }
        System.out.println("-- 3ª fase: Fusão dos equivalentes --");
        // identificando os estados equivalentes
        ArrayList<Estado> pararemover = new ArrayList<>();
        for (int i = 0; i < tam; i++) {
            for (int y = 0; y < tam; y++) {
                //se estiver maracda, ignora.
                if(classes[i][y].marcada) continue;
                Estado qu = estados.get(i+1); //captura o estado qu
                Estado qv = estados.get(y);   //captura o estado qv
                // criando um novo estado que o substitui
                Estado Qnovo = new Estado("q0"+qu.getIndex()+qv.getIndex()); //q012, q023...
                Qnovo.setFinal(qu.isFinal());
                if(qu.equals(inicial) | qv.equals(inicial)) inicial=Qnovo;
                estados.add(Qnovo);
                
                System.out.println("-- Fundindo o par {" + qu + "," + qv + "} no estado "+Qnovo);
                // copiando as transições a esse novo estado
                // não é precisa ver as transições de qv, pois esses são equivalentes.
                for(char c : qu.transicoes.keySet()){
                    if(qu.transicoes.get(c).isEmpty()) continue;
                    System.out.println("newTransicao("+Qnovo.getNome()+","+c+", "+qu.transicoes.get(c).get(0).getNome()+")");
                    newTransicao(Qnovo.getNome(), c+"", qu.transicoes.get(c).get(0).getNome());
                }
                // procurando referencias a esses estados e trocando para o novo
                for(Estado e :estados){
                    //se for um dos dois ignora
                    if(e.equals(qu) | e.equals(qv)) continue;
                    //se não, para cada transição, verificamos se existe o estado.
                    for(char c : e.transicoes.keySet()){
                        // cada transição contem qu ou qv?
                        if (e.transicoes.get(c).contains(qu) | e.transicoes.get(c).contains(qv)){
                            //se houver, limpa e troca a referencia
                            e.transicoes.get(c).clear();
                            e.transicoes.get(c).add(Qnovo);
                        }
                    }
                }
                pararemover.add(qu);
                pararemover.add(qv);
            }
        }
        estados.removeAll(pararemover);
        
        

    }

    private void marcarEncabecado(Estado qu, Estado qv) {
        // se {qu,qv} encabeçam a lista de pares, então maracmos todos os pares da lista e recursivamente
        // se algum par da lista encabeça outra lista
        System.out.println("-- {" + qu + "," + qv + "} encabeça a lista: " + classes[estados.indexOf(qu) - 1][estados.indexOf(qv)].pares);
        if (!classes[estados.indexOf(qu) - 1][estados.indexOf(qv)].pares.isEmpty()) {
            System.out.println("-- os pares devem ser marcado.");
            for (ParEq p : classes[estados.indexOf(qu) - 1][estados.indexOf(qv)].pares) {
                marcarEncabecado(p.q1, p.q2);
            }
        }
        classes[estados.indexOf(qu) - 1][estados.indexOf(qv)].marcar();
    }

    private void mostraClasses() {
        System.out.println("-- -------------- --");
        tam = classes.length;
        System.out.print("\t");
        for (int y = 0; y < tam; y++) {
            System.out.print(estados.get(y) + "\t");
        }
        System.out.println("");
        for (int i = 0; i < tam; i++) {
            System.out.print(estados.get(i + 1) + "\t");
            for (int y = 0; y < tam; y++) {
                System.out.print( 
                        (classes[i][y].marcada? "[X]" : "[ ]") +"\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < tam; i++) {
            for (int y = 0; y < tam; y++) {
                if(classes[i][y].pares.isEmpty()) continue;
                System.out.println("*"+estados.get(y)+","+estados.get(i + 1)+"-->"+ classes[i][y].pares + "");
            }
        }
        
        System.out.println("-- -------------- --");
    }

    public void minimizar() { 
        PrintStream ps = null;
        PrintStream atual = System.out;
        try {
            //cria o arquivo de log
            File arquivo = new File("logMinimizacao.txt");
            ps = new PrintStream(arquivo); //cria um stream de saida
            System.setOut(ps); //troca a saida padrão do sistema.
            
            gerarRelatorio("----Automato original----");
            System.out.println("-- ----------------------- --");
            eliminarTransicoesEmVazio();
            gerarRelatorio("----Eliminada as transições em vazio----");
            System.out.println("-- ----------------------- --");
            eliminarNaoDeterminismo();
            gerarRelatorio("----Eliminados os Não determinismos----");
            System.out.println("-- ----------------------- --");
            eliminarEstadosInacessiveis();
            gerarRelatorio("----Eliminados estados inacessiveis----");
            System.out.println("-- ----------------------- --");
            eliminarEstadosInuteis();
            gerarRelatorio("----Eliminados estados inuteis----");
            System.out.println("-- ----------------------- --");
            minimizando();
            gerarRelatorio("----Minimizando ----");
            System.out.println("-- ----------------------- --");
            eliminarEstadosInacessiveis();
            eliminarEstadosInacessiveis();
            gerarRelatorio("----Eliminados estados inacessiveis----");
            System.out.println("-- ----------------------- --");
            System.out.println("-- ----------------------- --");
            eliminarEstadosInuteis();
            gerarRelatorio("----Eliminados estados inuteis----");
            System.out.println("-- ----------------------- --");
            gerarRelatorio("----Automato Minimizado:----");
            System.out.println("-- ----------------------- --");
        } catch (FileNotFoundException ex) {
            
        } finally {
            ps.close();
        }
        System.setOut(atual); //devolve a saida padrão
        
    }

    @Override
    public String toString() {
        String toReturn = nome + " = (Q, \u03a3, \u03b4, " + inicial + ", F);";

        toReturn += "\nQ=[ ";
        for (Estado e : estados) {
            toReturn += e + ",";
        }
        toReturn = toReturn.substring(0, toReturn.length() - 1) + "]";

        toReturn += "\n\u03a3=[ ";
        for (char c : alfabeto) {
            toReturn += c + ",";
        }
        toReturn = toReturn.substring(0, toReturn.length() - 1) + "]";

        toReturn += "\n\u03b4 = { ";
        for (Estado e : estados) {
            for (char c : e.transicoes.keySet()) {
                toReturn += "(" + e + "," + c + ") = {";
                for (Estado ee : e.transicoes.get(c)) {
                    toReturn += ee + ",";
                }
                toReturn = toReturn.substring(0, toReturn.length() - 1) + "} ; ";
            }
        }
        toReturn += " }\nF= [ ";
        for (Estado ee : estados) {
            if (ee.isFinal()) {
                toReturn += ee + ",";
            }
        }
        toReturn = toReturn.substring(0, toReturn.length() - 1) + "]";

        return toReturn;
    }

    public void gerarRelatorio(String oper) {
        System.out.println(oper);
        System.out.println(toString());
    }

    public static void main(String[] args) {

        Automato a = new Automato();
        String automato = "M1=({q0,q1,q2,q3,q4},"
                + "{a,b,c},"
                + "{(q0,a)=q1 ; (q0,b)=q2 ; (q0,E)={q2,q3} ; (q2,c)={q3,q1} ; (q3,a)=q4;},"
                + "{q0},"
                + "{q2,q3})";
        String iscompleta = "[m|M][1-9]=\\(\\{(q[0-9]|,)*\\},"
                + "\\{([a-z]|,)*\\},"
                + "\\{(\\(q[0-9],([a-z]|E)\\)=\\{?(q[0-9]|,){1,}\\}?|\\s;\\s|;)*\\}," + //{(q0,a) = q1 ; (q0,b) = q2 ; (q0,E) = {q2,q3} },
                "\\{(q[0-9])*\\}," + //{q0},
                "\\{(q[0-9]|,)*\\}\\)"; //{q2,q3})

        if (automato.matches(iscompleta)); else {
            System.out.println("Automato de entrada n_o confere com o padr_o:\n " + automato + " \nDeve seguir o modelo:\n "
                    + "M1=(Estados,Alfabeto,Transi__es,Estado Inicial,Estados Finais)\n "
                    + "M1=({q0,q1,q2,q3,...},"
                    + "{a,b,...},"
                    + "{(q0,a)=q1 ; (q0,E)={q2,q3,...} ...},"
                    + "{q0},"
                    + "{q2,...})");
            return;
        }
        System.out.println("Automato: " + automato);
        Matcher m;

        //** estudo do alfabeto em modo texto **//
        m = Pattern.compile("\\{([a-z]|,)*\\}").matcher(automato);  //captura {a,b,c...}
        String simbolos = m.find() ? m.group().replaceAll("\\{|\\}|,", "") : "E";
        a.alfabeto = simbolos.toCharArray();

        //** estudo dos estados em modo texto **//
        m = Pattern.compile("[m|M][1-9]=\\(\\{(q[0-9]|,)*\\}").matcher(automato);          //captura M1={q0,q1,q2,q3,...}
        m = Pattern.compile("q[0-9]").matcher(m.find() ? m.group() : "");   //captura os estados
        while (m.find()) {
            a.addEstado(m.group());
        }

        //** estudo das transi__es em modo texto **//
        String patt = "\\(q[0-9],([a-z]|E)\\)=\\{?(q[0-9]|,){1,}\\}?"; //captura: (q0,b) = q2 ou (q0,E) = {q2,q3}
        m = Pattern.compile(patt).matcher(automato);
        String estadoOrigem = "", simbolo = "", transicao;
        String[] estadosDestinos = args;
        Matcher subm;
        while (m.find()) {
            transicao = m.group(); //(qu,a)={qv,qn,qm,...}
            subm = Pattern.compile("\\(q[0-9],").matcher(transicao); //captura o estado origem
            while (subm.find()) {
                estadoOrigem = subm.group().replaceAll("\\(|,", "");
            }
            subm = Pattern.compile("([a-z]|E)\\)").matcher(transicao); //captura o estado origem
            while (subm.find()) {
                simbolo = subm.group().replaceAll("\\)", "");
            }
            subm = Pattern.compile("=\\{?(q[0-9]|,){1,}\\}?").matcher(transicao); //captura o estado origem
            while (subm.find()) {
                estadosDestinos = subm.group().replaceAll("\\)|=|\\{|\\}", "").split(",");
            }
            a.newTransicao(estadoOrigem, simbolo, estadosDestinos);
        }

        //** estudo dos estados finais em modo texto **//
        m = Pattern.compile("\\{(q[0-9]|,)*\\}\\)").matcher(automato);          //captura {q2,q3})
        m = Pattern.compile("q[0-9]").matcher(m.find() ? m.group() : "");   //captura os estados finais
        while (m.find()) {
            a.turnFinal(m.group());
        }


        //** estudo do estado inicial em modo texto **//
        m = Pattern.compile(",\\{q[0-9]\\},").matcher(automato);          //captura {q0})
        while (m.find()) {
            a.setInicial(m.group().replaceAll("\\{|\\}|,", ""));
        }


        a.minimizar();
    }

    public Estado getInicial() {
        return inicial;
    }

    public void setInicial(Estado inicial) {
        this.inicial = inicial;
    }

    public char[] getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(char[] alfabeto) {
        this.alfabeto = alfabeto;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
