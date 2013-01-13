
package control;

import java.awt.Color;
import java.util.LinkedList;
import model.Forca;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class FabricaGrafico {

    public static JFreeChart getChart(LinkedList<Forca> f,String s){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Forca i : f) {
            Number modulo = i.getModule();
            dataset.addValue(modulo,i.getName(),i.getName());
        }

       JFreeChart chart = ChartFactory.createBarChart3D(
                "Gráfico do Módulo da Força "+s,
                "Posição da carga -Q",
                "Módulos",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, true);


        chart.setBackgroundPaint(Color.white);
        chart.setAntiAlias(true);
        chart.getTitle().setPaint(Color.DARK_GRAY);

        return chart;
    }

    public static void exportChartPDF(JFreeChart c){

    }
}
