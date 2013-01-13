
package grafico;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class First {

    public static void main(String[] args) {
        // create a dataset2...
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 43.2);
        dataset.setValue("Category 2", 27.9);
        dataset.setValue("Category 3", 79.5);
// create a chart...
        JFreeChart chart = ChartFactory.createPieChart(
                "Sample Pie Chart",
                dataset,
                true, // legend?
                true, // tooltips?
                false // URLs?
                );
// create and display a frame...
        ChartFrame frame = new ChartFrame("First", chart);
        frame.pack();
        frame.setVisible(true);




        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.addValue(1.0, "Row 1", "Column 1");
        dataset2.addValue(5.0, "Row 1", "Column 2");
        dataset2.addValue(3.0, "Row 1", "Column 3");
        dataset2.addValue(2.0, "Row 2", "Column 1");
        dataset2.addValue(3.0, "Row 2", "Column 2");
        dataset2.addValue(2.0, "Row 2", "Column 3");
        JFreeChart chart2 = ChartFactory.createBarChart(
                "Bar Chart Demo", // chart title
                "Category", // domain axis label
                "Value", // range axis label
                dataset2, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips?
                false // URLs?
                );
    
        ChartFrame frame2 = new ChartFrame("Second", chart2);
        frame2.pack();
        frame2.setVisible(true);
    }
}





