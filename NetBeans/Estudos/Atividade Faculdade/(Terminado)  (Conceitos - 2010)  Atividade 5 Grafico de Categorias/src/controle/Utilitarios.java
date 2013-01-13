package controle;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Category;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class Utilitarios {

    public static boolean verificaDados(String texto) {
        if (texto.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha corretamente o campo");
            return false;
        }
        if (!texto.contains("-")) {
            JOptionPane.showMessageDialog(null, "Preencha corretamente usando a seguinte forma:\n"
                    + "Categoria - valor");
            return false;
        }
        return true;
    }

    public static Category makeNewCategory(String texto) {
        try {
            String categoria;
            double valor;
            String[] textot;
            //Usando indexOF
            //int positionTrace;
            //positionTrace = texto.indexOf("-");
            //categoria = texto.substring(0, positionTrace - 1);
            //valor = Double.parseDouble(texto.substring(positionTrace + 1, texto.length()));

            //Usando split
            textot = texto.split("-");
            categoria = textot[0];
            valor = Double.parseDouble(textot[1]);

            //Expressão regular
            //[a-z,A-Z]* - [0-9]*\.[0-9]*
            

            return new Category(categoria, valor);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preencha corretamente usando a seguinte forma:\n"
                    + "Categoria - valor\n"
                    + "Sendo valor um número");
            return null;
        }
    }

    public static boolean alreadInList(List<Category> lc, Category c) {
        Iterator i = lc.listIterator();
        while (i.hasNext()) {
            Category a = (Category) i.next();
            if (a.getName().equals(c.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<Category> removeInList(List<Category> lc, Category c) {
        Iterator i = lc.listIterator();
        while (i.hasNext()) {
            Category a = (Category) i.next();
            if (a.getName().equals(c.getName())) {
                lc.remove(a);
                break;
            }
        }
        return lc;

    }

    public static List<Category> updateInList(List<Category> lc, Category c) {
        Iterator i = lc.listIterator();
        while (i.hasNext()) {
            Category a = (Category) i.next();
            if (a.getName().equals(c.getName())) {
                lc.remove(a);
                a.setValue(c.getValue());
                lc.add(a);
                break;
            }
        }
        return lc;
    }

    public static DefaultListModel copyListInModel(DefaultListModel dlm, List<Category> lc) {
        Iterator i = lc.listIterator();
        while (i.hasNext()) {
            dlm.addElement(i.next());
        }
        return dlm;

    }

    public static JFreeChart criaGraficoPie(Object[] o) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int i = 0; i < o.length; i++) {
            Category categoria = (Category) o[i];
            dataset.setValue(categoria.getName(), categoria.getValue());
        }

        JFreeChart chart = ChartFactory.createPieChart3D(
                "Categorias",
                dataset,
                true, // legend?
                true, // tooltips?
                false // URLs?
                );

        chart.setBackgroundPaint(Color.white);
        chart.setAntiAlias(true);
        chart.getTitle().setPaint(Color.DARK_GRAY);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(170);
        plot.setDirection(Rotation.ANTICLOCKWISE);
        plot.setForegroundAlpha(0.60f);
        Rotator rotator = new Rotator((PiePlot3D)chart.getPlot());
        rotator.start();

        return chart;
    }
    public static JFreeChart criaGraficoBar(Object[] o) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < o.length; i++) {
            Category categoria = (Category) o[i];
            dataset.addValue(categoria.getValue(),categoria.getName(),categoria.getName());
        }
        JFreeChart chart = ChartFactory.createBarChart3D(
                "Categorias", 
                "Categoria", 
                "Valores", 
                dataset,
                PlotOrientation.VERTICAL,
                true, true, true);

        chart.setBackgroundPaint(Color.white);
        chart.setAntiAlias(true);
        chart.getTitle().setPaint(Color.DARK_GRAY);
        return chart;
    }

    public static JFreeChart criaGraficoLine(Object[] o) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < o.length; i++) {
            Category categoria = (Category) o[i];
            dataset.addValue(categoria.getValue(),"",categoria.getName());
        }

        JFreeChart chart = ChartFactory.createLineChart3D("Categorias",
                "Categorias",
                "Valores",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, true);

        chart.setBackgroundPaint(Color.white);
        chart.setAntiAlias(true);
        chart.getTitle().setPaint(Color.DARK_GRAY);

        return chart;
    }
}
