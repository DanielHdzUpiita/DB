package Tablas;

import DB.Generica;
import java.util.LinkedList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModeloTabla1 implements TableModel{
    public String[] columnNames;
    public LinkedList datos = new LinkedList();
    private LinkedList listeners = new LinkedList();    
    public ModeloTabla1() {
    }
    public ModeloTabla1(String[] columnNames) {
        this.columnNames = columnNames;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object obj = null;
        try
        {
            Generica a = (Generica) datos.get(rowIndex);
            obj = a.getValue(columnIndex);
        }catch(Exception e){
            e.printStackTrace();
        }
        return obj;
    }
    
    @Override
    public int getRowCount() {
        int total = 0;
        try{
            total = datos.size();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return total;
    }
    
    @Override
    public int getColumnCount() {
        int total = 0;
        try{
            total = columnNames.length;
        }catch(Exception e){
            e.printStackTrace();
        }
        return total;
    }
    
    @Override
    public String getColumnName(int columnIndex) 
    {
        String name = null;
        try{
            name = columnNames[columnIndex];
        }catch(Exception e){
            e.printStackTrace();
        }
        return name;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class<?> c = null;
        try{
            Generica a = (Generica) datos.get(0);
            //obj = a.getValue(columnIndex);
            c = a.getClass(columnIndex);
        }catch(Exception e){
            e.printStackTrace();
        }
        return c;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    public void removeObject (int fila)
    {
        datos.remove(fila);
        
        TableModelEvent evento = new TableModelEvent (this, fila, fila, 
            TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
        
        avisaSuscriptores (evento);
    }
    /** 
     * Añadir un nuevo producto al final de la tabla.
     * @param p Producto que se agregará a la tabla.
     */
    public void addObject(Generica g){
        datos.add(g);
        TableModelEvent evento;
        evento = new TableModelEvent (this, this.getRowCount()-1,
            this.getRowCount()-1, TableModelEvent.ALL_COLUMNS,
            TableModelEvent.INSERT);

        avisaSuscriptores (evento);
    }
    
    @Override
    public void addTableModelListener(TableModelListener l) {
        listeners.add (l);
    }
    
    @Override
    public void removeTableModelListener(TableModelListener l) {
        listeners.remove(l);
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) 
    {
        Generica a;
        a = (Generica)(datos.get(rowIndex));
        a.setValue(columnIndex, aValue);

        TableModelEvent evento = new TableModelEvent (this, rowIndex, rowIndex, 
            columnIndex);

        avisaSuscriptores (evento);
    }
    
    private void avisaSuscriptores (TableModelEvent evento)
    {
        int i;
        for (i=0; i<listeners.size(); i++)
            ((TableModelListener)listeners.get(i)).tableChanged(evento);
    }
}