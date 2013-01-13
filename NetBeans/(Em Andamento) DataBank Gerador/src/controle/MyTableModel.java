package controle;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel {

    private static final long serialVersionUID = 1L;
    private final List entitysToList;
    private final Class entityClassToList;
    private List<Method> fieldToData = new LinkedList<Method>();
    private final JTable tableToControl;

    public MyTableModel(Class entityClassToList, List entitysToList,JTable tableToControl) {
        super();
        this.entitysToList = entitysToList;
        this.entityClassToList = entityClassToList;
        this.tableToControl = tableToControl;
        try {
            startAddTheColumns();
            startAddValues();
        } catch (Exception ex) {
            Logger.getLogger(MyTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void startAddTheColumns() throws NoSuchMethodException, InstantiationException, IllegalAccessException {
        for (Field field : entityClassToList.getDeclaredFields()) {
            SwingColumn theAnnotation = field.getAnnotation(SwingColumn.class);
            if (theAnnotation != null) {
                addColumn(theAnnotation.description());
                // "nome" virá get + N + ome
                String methodName = "get" + field.getName().toUpperCase().charAt(0) + field.getName().substring(1);
                fieldToData.add(entityClassToList.getDeclaredMethod(methodName));
            }
        }
    }

    private void startAddValues() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        for (Object entity : entitysToList) {
            List<Object> valuesToAdd = new LinkedList<Object>();
            for (Method method : fieldToData)
                valuesToAdd.add(method.invoke(entity));
            addRow(valuesToAdd.toArray());
        }
    }
    
}
