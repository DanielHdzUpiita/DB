package DB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Aviso extends Generica{
    public int id;
    public String aviso;
    
    @Override
    public Object getValue(int cIx){
        switch(cIx){
            case 0:
                return id;
            case 1:
                return aviso;
            default:
                return null;
        }
    }
    
    @Override
    public Class<?> getClass(int cIx)
    {
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
                aviso = (String)obj;
                break;
            default:
                break;
        }
    }

    @Override
    public void consulta(ResultSet res, String c) {
        try {
            int a = 0;
            String b = "";
            if(c.contains("*"))
            {
                a = res.getInt("id_aviso");
                b = res.getString("aviso");
            }
            if(c.contains("id_aviso")){
                a = res.getInt("id_aviso");
            }
            if(c.contains("aviso")){
                b = res.getString("aviso");
            }
            id = a;
            aviso = b;
        } catch (SQLException ex) {
        }
    }

    @Override
    public boolean isEqual(Object g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
