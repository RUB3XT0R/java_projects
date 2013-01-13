package graficos;



import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;


public  class GraficoLinearCategoriasDedado {
    //lista de dados para o gráfico (ver em FuncaoGUI como são inseridos os valores)
    public static DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    public  static  void main (String [] args) {

    //colocando dados
    for(int i=-30; i<30 ; i++) dataset.addValue((i*i*i),"Numeros",i+"º");
    for(int i=-30; i<30 ; i++) dataset.addValue((2*i + 1),"Joana",i+"º");

    //criação do gráfico
    JFreeChart chart = ChartFactory.createLineChart(
        "ritinha",//titulo do gráfico
        "Resultados",//eixoy
        "Valores de Entrada",//eixox
        dataset,//base de dados
        PlotOrientation.VERTICAL,
        true,//legenda
        true,//dica, popup
        false//urls
    );

    //personalizando o gráfico

    TextTitle source = new TextTitle("aqui vai seu texto");
    source.setFont(new Font("SansSerif", Font.PLAIN, 10));
    source.setPosition(RectangleEdge.BOTTOM);
    source.setHorizontalAlignment(HorizontalAlignment.RIGHT);
    source.setBackgroundPaint(Color.WHITE);

    chart.addSubtitle(source);
    chart.setBackgroundPaint(Color.yellow);


    CategoryPlot plot = (CategoryPlot) chart.getPlot();
    plot.setBackgroundPaint(Color.DARK_GRAY);
    plot.setRangeGridlinePaint(Color.BLACK);

    //desenha os pontos
    LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
    renderer.setShapesVisible(true);
    renderer.setDrawOutlines(true);
    renderer.setUseFillPaint(true);
    renderer.setLegendTextPaint(1,Color.WHITE);

    // change the auto tick unit selection to integer units only...
    NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
    rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

    ChartFrame frame = new ChartFrame ( "titulo da janela" , chart);
    frame.pack ();
    frame.setLocationRelativeTo(null);
    frame.setVisible ( true );
    }
}