package DB;

import java.sql.ResultSet;

public class Prenda extends Generica{
    public String genero;
    public String marca;
    public String tela;

    @Override
    public Object getValue(int cIx) {
        switch(cIx)
        {
            case 0:
                return genero;
            case 1:
                return marca;
            case 2:
                return tela;
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
                return Object.class;
        }
    }

    @Override
    public void setValue(int cIx, Object obj) {
        switch(cIx)
        {
            case 0:
                genero = (String)obj;
                break;
            case 1:
                marca = (String)obj;
                break;
            case 2:
                tela = (String)obj;
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
