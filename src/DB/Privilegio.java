/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author OSVALDO
 */
public class Privilegio extends Generica{
    public int id;
    public String priv;
    @Override
    public Object getValue(int cIx) {
        switch(cIx){
            case 0:
                return id;
            case 1:
                return priv;
            default:
                return null;
        }
    }

    @Override
    public Class<?> getClass(int cIx) {
        Class<?> c;
        switch(cIx){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            default:
                return Object.class;
        }
    }

    @Override
    public void setValue(int cIx, Object obj) {
        switch(cIx){
            case 0:
                id = (Integer)obj;
                break;
            case 1:
                priv = (String)obj;
                break;
            default:
                break;
        }
    }

    @Override
    public void consulta(ResultSet res, String c) {
        //Privilegio aux = new Privilegio();
        try {
            int a = 0;
            String b = "";
            if(c.contains("*"))
            {
                a = res.getInt("id_privilegio");
                b = res.getString("descripcion");
            }
            if(c.contains("id_privilegio")){
                a = res.getInt("id_privilegio");
            }
            if(c.contains("descripcion")){
                b = res.getString("descripcion");
            }
            id = a;
            priv = b;
        } catch (SQLException ex) {
        }
        //return aux;
    }

    @Override
    public boolean isEqual(Object g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
