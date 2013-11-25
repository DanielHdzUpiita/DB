package DB;

import java.sql.ResultSet;

public class Usuario extends Generica{
    public int id;
    public int priv;
    public String user;
    public String pass;
    @Override
    public Object getValue(int cIx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Class<?> getClass(int cIx) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValue(int cIx, Object obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void consulta(ResultSet res, String c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEqual(Object g) {
        if(this.user.equals(((Usuario)(g)).user) )
        {
            if(this.pass.equals(((Usuario)(g)).pass)){
                return true;
            }
        }
        return false;
    }
    
}
