

package grafico;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Chart {
    /*
    public static void main(String[] args) {
        double[] valor = new double[3];
        valor[0]=24;
        valor[1]=12;
        valor[2]=36;
        
        Chart ct= new Chart();
        
        ChartFrame frame = new ChartFrame("First", ct.criaGrafico(valor));
        frame.pack();
        frame.setVisible(true);
    }
    */
    public JFreeChart criaGrafico(double[] valor) {
        // create a dataset2...
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Filial 1", valor[0]);
        dataset.setValue("Filial 2", valor[1]);
        dataset.setValue("Filial 3", valor[2]);
        // create a chart...
        JFreeChart chart = ChartFactory.createPieChart(
                "participação do faturamento",
                dataset,
                true, // legend?
                true, // tooltips?
                false // URLs?
                );

        return chart;
    }

    public JFreeChart criaGraficoLine(double[] valor) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(212, "Classes", "JDK 1.0");
        dataset.addValue(504, "Classes", "JDK 1.1");
        dataset.addValue(1520, "Classes", "SDK 1.2");
        dataset.addValue(1842, "Classes", "SDK 1.3");
        dataset.addValue(2991, "Classes", "SDK 1.4");
        // create the chart...
        JFreeChart chart = ChartFactory.createLineChart(
                "Java Standard Class Library", // chart title
                "Release", // domain axis label
                "Class Count", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                false, // include legend
                true, // tooltips
                false // urls
                );
        return chart;
    }
}
