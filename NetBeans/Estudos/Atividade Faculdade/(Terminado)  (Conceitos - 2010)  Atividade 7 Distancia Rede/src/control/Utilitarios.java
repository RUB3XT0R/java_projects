
package control;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import model.Nodo;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;

public class Utilitarios {
    public static boolean verificaDados(String texto) {
        if (texto.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Preencha corretamente o campo");
            return false;
        }
        if (!texto.contains(",")) {
            JOptionPane.showMessageDialog(null,
                    "Preencha corretamente usando a seguinte forma: x,y");
            return false;
        }
        return true;
    }
    public static boolean verificaCaminho(String texto) {
        if (texto.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Preencha corretamente o caminho");
            return false;
        }
        if (texto.contains("\\")) {
            JOptionPane.showMessageDialog(null,
                    "Favor trocar todas as barra \"\\\" por \"/\" " );
            return false;
        }
        return true;
    }
    public static Nodo criarNodo(String texto){
     try {
            String[] textot  = texto.split(",");
            int x = Integer.parseInt(textot[0]);
            int y = Integer.parseInt(textot[1]);
            return new Nodo(x,y);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                    "Preencha corretamente usando a seguinte forma: x,y "
                    + "\nSendo x e y valores inteiros.");
            return null;
        }
    }
    public static boolean estaNaLista(List<Nodo> ln, Nodo n){
        for(Nodo aux : ln) if ( aux.equals(n) )return true;
        return false;
    }
    public static JFreeChart makeChart(List<Nodo> ln) {

        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries serie;
        for (Nodo aux : ln) {
            serie = new XYSeries(aux.toString());
            serie.add(aux.getX(), aux.getY());
            dataset.addSeries(serie);
        }
        JFreeChart chart = ChartFactory.createXYLineChart(
                "POints",
                "X","Y",
                dataset, // data
                PlotOrientation.VERTICAL,
                false, // include legend
                true, // tooltips
                false // urls
                );
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setRangeGridlinePaint(Color.BLACK);
        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();
        renderer.setShapesVisible(true);
        renderer.setShapesFilled(true);
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        return chart;
    }
}
