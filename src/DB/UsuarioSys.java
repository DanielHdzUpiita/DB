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
public class UsuarioSys extends Generica {
    public String nombre;
    public String pass;
    public String priv;

    @Override
    public Object getValue(int cIx) {
        switch(cIx)
        {
            case 0:
                return nombre;
            case 1:
                return pass;
            case 2:
                return priv;
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
            default:
                return null;
        }
    }

    @Override
    public void setValue(int cIx, Object obj) {
        switch(cIx)
        {
            case 0:
                nombre = (String)obj;
                break;
            case 1:
                pass = (String)obj;
                break;
            case 2:
                priv = (String)obj;
                break;
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
