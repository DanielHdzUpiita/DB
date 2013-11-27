package ObjetosDB;

import java.sql.*;

public class ConexionBD {
    Connection conexion;
    String user = "root";
    Statement instruccion;
    String password = "malinali";
    //String password = "eagle";
    public ResultSet resultado;
    public String catalog = "proyectofinal";
    public String url = "jdbc:mysql://localhost:3306/";
    /*String query = "SELECT ? FROM ?";
    String insert = "INSERT INTO ? (?) VALUES (?)";
    String update = "UPDATE ? SET ? WHERE ?";
    String delete = "DELETE FROM ? WHERE ?";*/
    
    public ConexionBD() {
        url += catalog;
    }
    
    public boolean estaConectado(){
        try {
            return conexion.isValid(10);
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean iniciar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean detener(){
        try {
            instruccion.close();
            conexion.close();
            return true;
        }
        catch ( SQLException excepcionSQL ) {
            return false;
        }
    }
        
    public boolean consultar(String consulta) {
        try {
            instruccion = conexion.createStatement();
            resultado = instruccion.executeQuery(consulta);
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public boolean exec(String procedure){
        try{
            instruccion = conexion.createStatement();
            instruccion.executeUpdate(procedure);
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean insertar(String table_name, String column_name, String column_value){
        try {
            instruccion = conexion.createStatement();
            instruccion.executeUpdate("INSERT INTO " + table_name + " (" + column_name + ") VALUES ("+ column_value +")");
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean editar(String table_name, String column_values, String conditions){
        try {
            instruccion = conexion.createStatement();
            instruccion.executeUpdate("UPDATE "+table_name+" SET "+column_values+" WHERE "+conditions);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean eliminar(String table_name, String conditions){
        try {
            instruccion = conexion.createStatement();
            instruccion.executeUpdate("DELETE FROM "+table_name+" WHERE "+conditions);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
