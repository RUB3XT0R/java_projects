
package Relatorios;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import modelo.Evento;
import modelo.Item;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class RelatorioFactory {

    private static JasperPrint jasperPrint;

    public void gerarRelatorio(Evento e){
            // O objeto JasperReport representa o objeto JasperDesign (arquivo .jrxml) compilado.
            // Ou seja, o arquivo .jasper
            //JasperReport jr = (JasperReport)JRLoader.loadObject("Relatorios/relatoriook.jrxml");
           // JasperDesign design = JasperManager.loadXmlDesign("Relatorios/relatoriook.jrxml");
            //JasperReport jr = JasperManager.compileReport(design);
             //JasperDesign jasperDesign = JRXmlLoader.load("C:/Users/Lucas Biason/Desktop/OrcamentoRelatorio/src/Relatorios/relatoriook.jrxml");
            
             //JasperReport jr = JasperCompileManager.compileReport(jasperDesign);

            //URL arquivo = getClass().getResource( "Relatorios/relatoriook.jasper" );
            //JasperReport jr = (JasperReport) JRLoader.loadObject( arquivo );
            Map parametros = new HashMap();
            parametros.put("data",e.getData());
            parametros.put("evento",e.getEvento());
            parametros.put("horario",e.getHorario());
            parametros.put("local",e.getLocal());
            parametros.put("npessoa",e.getNumeroPessoas());
            parametros.put("oe",e.getOe());
            parametros.put("total",e.getTotal());

            List<String> itensString = new LinkedList<String>();
            List<Item> itens = e.getItens();
            String str="";
            for(Item i : itens) {
                itensString.add(i.toString());
                str+=i.toString()+"\n";
            }
            parametros.put("itens",str);

            JRDataSource jrds = new JRBeanCollectionDataSource(itensString);
            try{
                JasperReport jasperReport = JasperCompileManager.compileReport("src/Relatorios/relatoriook.jrxml");
                jasperPrint = JasperFillManager.fillReport(jasperReport, parametros,jrds);
                //JasperViewer.viewReport(print, true);
                }catch(JRException ex){
                    ex.printStackTrace();
                }

            //e.setItens(montaLista());
            // JasperPrint representa o relatório gerado.
            // É criado um JasperPrint a partir de um JasperReport, contendo o relatório preenchido.
            //this.jasperPrint = JasperFillManager.fillReport(jr, parametros,new JREmptyDataSource());

       

    }
    public void exibirRelatorio() {
        // emite o relatório na tela
        // false indica que a aplicação não será finalizada caso o relatório seja fechado
        JasperViewer.viewReport(jasperPrint, false);
    }

    public void exportaParaPdf(String caminhoDestino) throws JRException {

        try {
            // Gera o arquivo PDF
            JasperExportManager.exportReportToPdfFile(this.jasperPrint, caminhoDestino);
        } catch (JRException e) { throw e; }

    }

    public void exportaParaHtml(String caminhoDestino) throws JRException {

        try {
            // Gera o arquivo PDF
            JasperExportManager.exportReportToHtmlFile(this.jasperPrint, caminhoDestino);
        } catch (JRException e) { throw e; }

    }
    
    
}
