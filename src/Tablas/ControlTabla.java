/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import DB.Generica;

/**
 *
 * @author OSVALDO
 */
public class ControlTabla {
    private ModeloTabla1 modelo = null;
    public ControlTabla(ModeloTabla1 modelo)
    {
        this.modelo = modelo;
    }
    /**
     * Agrega un producto al ModeloTabla.
     * @param p Producto que se agregará el ModeloTabla.
     */
    public void addFila(Generica g){
        modelo.addObject(g);
    }
    /**
     * Borra una fila del ModeloTabla.
     * @param rowIndex Fila que se eliminará del ModeloTabla.
     */
    public void borrarFila(Integer rowIndex){
        if (modelo.getRowCount() > 0)
            modelo.removeObject(rowIndex);
    }
}
