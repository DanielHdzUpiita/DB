package DB;

import java.sql.ResultSet;

public class VistaPrendas extends Generica {

    public String tipoPrenda;
    public String genero;
    public String color;
    public String tela;
    public String marca;
    public String talla;
    public int cantidad;
    public float precio;
    public float costo;
    public int id;
    
    
    @Override
    public Object getValue(int cIx) {
        switch(cIx)
        {
            case 0:
                return tipoPrenda;
            case 1:
                return genero;
            case 2:
                return color;
            case 3:
                return tela;
            case 4:
                return marca;
            case 5:
                return talla;
            case 6:
                return cantidad;
            case 7:
                return precio;
            case 8:
                return costo;
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
                return String.class;
            case 6:
                return int.class;
            case 7:
                return float.class;
            case 8:
                return float.class;
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
                genero = (String)obj;
                break;
            case 2:
                color = (String)obj;
                break;
            case 3:
                tela = (String)obj;
                break;
            case 4:
                marca = (String)obj;
                break;
            case 5:
                talla = (String)obj;
                break;
            case 6:
                cantidad = (int)obj;
                break;
            case 7:
                precio = (float)obj;
                break;
            case 8:
                costo = (float)obj;
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
