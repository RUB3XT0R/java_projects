
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Set;
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
        if("".equals(estadoOrigem) || "".equals(simbolo) || estadosDestinos.length<1) return false;
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
        if(e == null) return false;
        //Caso já exista a transição com o simbolo,
        //o(s) estado(s) e(são) adicionado(s) a lista
        Estado ad;
        int i;
        if (e.transicoes.containsKey(simbol)) {
            for (String est : estadosDestinos) {
                i = estados.indexOf(new Estado(est));
                if(i==-1)continue;
                ad = estados.get(i);
                if (e.transicoes.get(simbol).contains(ad)) continue;
                e.transicoes.get(simbol).add(ad);
            }
        } else {
            //caso não exista, uma lista de estados é criada e inserida a nova transição
            ArrayList<Estado> listadestinos = new ArrayList<>();
            for (String est : estadosDestinos) {
                i = estados.indexOf(new Estado(est));
                if(i==-1)continue;
                ad = estados.get(i);
                listadestinos.add(ad);
            }
            if(listadestinos.isEmpty())return false;
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
        //para cada transi__o, captura a lista de estados "que na teoria e pr_tica ter_ apenas um estado" (AFD)
        for (char c : atual.transicoes.keySet()) {
            lista = atual.transicoes.get(c);
            for (Estado e : lista) {
                elEInac(e); //cada estado dessa transi__o (um apenas, devido ao algoritmo anterior) ser_ marcado e analizado
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
        for (Estado e : estados) { //percorre os estados em busca de refrencias ao estado atual.
            if (e.equals(atual) || e.isConsideracao()) {
                continue; //despreza se for o atual ou j_ considerado
            }
            for (char c : e.transicoes.keySet()) { //para cada transi__o
                // verifica se a lista de cada transi__o contem o estado, sen_o tiver, passa para a proxima
                if (e.transicoes.get(c).contains(atual)) {
                    //senao for inicial..continua a procura recursivamente, at_ chegar no estado inicial.
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

    private void minimizando() {
        
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
        eliminarTransicoesEmVazio();
        gerarRelatorio("----Eliminada as transi__es em vazio----");
        eliminarNaoDeterminismo();
        gerarRelatorio("----Eliminados os N_o determinismos----");
        eliminarEstadosInacessiveis();
        gerarRelatorio("----Eliminados estados inacessiveis----");
        eliminarEstadosInuteis();
        gerarRelatorio("----Eliminados estados inuteis----");
        minimizando();
        gerarRelatorio("----Minimizando ----");
        eliminarEstadosInacessiveis();
        gerarRelatorio("----Eliminados estados inacessiveis----");
        eliminarEstadosInuteis();
        gerarRelatorio("----Automato Minimizado:----");
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
