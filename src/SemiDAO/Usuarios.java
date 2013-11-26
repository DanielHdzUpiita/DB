/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SemiDAO;
import DB.UsuarioSys;
import ObjetosDB.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author OSVALDO
 */
public class Usuarios {
    ConexionBD con = new ConexionBD();
    
    public ArrayList<UsuarioSys> consulta(String cond){
        ArrayList<UsuarioSys> res = new ArrayList<>();
        try {
            String query = "select * from usuarios";
            if(!cond.equals("")){
                query +=  " where "+cond;
            }
            con.consultar(query);
            ResultSet rsDat = con.resultado;
            while(rsDat.next()){
                UsuarioSys us = new UsuarioSys();
                us.nombre = rsDat.getString("Nombre");
                us.pass = rsDat.getString("Pass");
                us.priv = Integer.toString(rsDat.getInt("Pass"));
                res.add(us);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public int priv(String priv){
        int res = 0;
        try {
            String query = "select idPriv from privilegios where nombre = '"+priv+"'";
            con.consultar(query);
            ResultSet rsDat = con.resultado;
            while(rsDat.next()){
                res = rsDat.getInt("idPriv");
                return res;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
