
package graficos;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class GraficoPizza {
    public  static  void main (String [] args) {

    DefaultPieDataset data = new DefaultPieDataset ();
    data.setValue ( "Section A" , 43.2);
    data.setValue ( "Section B" , 27.9);
    data.setValue ( "Section c" , 79.5);

    JFreeChart chart = ChartFactory.createPieChart ("Sample Pie Chart",data,true,true,false);

    PiePlot plot = (PiePlot) chart.getPlot();
    plot.setSectionPaint("Section A", new Color(200, 255, 255));
    plot.setSectionPaint("Section B", new Color(200, 200, 255));
    plot.setSectionPaint("Section C", new Color(255, 200, 255));
    plot.setIgnoreZeroValues(true);
    plot.setIgnoreNullValues(true);
    plot.setExplodePercent("Section A", 0.30);

    
    ChartFrame frame = new ChartFrame ( "First" , chart);
    frame.pack ();
    frame.setVisible ( true );

    }
}
