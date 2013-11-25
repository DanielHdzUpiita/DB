/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.ResultSet;

public abstract class Generica {
    public abstract Object getValue(int cIx);
    public abstract Class<?> getClass(int cIx);
    public abstract void setValue(int cIx, Object obj);
    public abstract void consulta(ResultSet res, String c);
    public abstract boolean isEqual(Object g);
}
