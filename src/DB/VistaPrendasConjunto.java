/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.ResultSet;

/**
 *
 * @author OSVALDO
 */
public class VistaPrendasConjunto extends Generica{

    public String tipoPrenda;
    public String color;
    public String tela;
    public String marca;
    public String talla;
    public Boolean delete = false;
    public int id;
    
    @Override
    public Object getValue(int cIx) {
        switch(cIx)
        {
            case 0:
                return tipoPrenda;
            case 1:
                return color;
            case 2:
                return tela;
            case 3:
                return marca;
            case 4:
                return talla;
            case 5:
                return delete;
            default:
                return null;
        }
    }

    @Override
    public Class<?> getClass(int cIx) {
        switch(cIx)
        {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return Boolean.class;
            default:
                return Object.class;
        }
    }

    @Override
    public void setValue(int cIx, Object obj) {
        switch(cIx)
        {
            case 0:
                tipoPrenda = (String)obj;
                break;
            case 1:
                color = (String)obj;
                break;
            case 2:
                tela = (String)obj;
                break;
            case 3:
                marca = (String)obj;
                break;
            case 4:
                talla = (String)obj;
                break;
            case 5:
                delete = (Boolean)obj;
            default:
                break;
        }
    }

    @Override
    public void consulta(ResultSet res, String c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEqual(Object g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
