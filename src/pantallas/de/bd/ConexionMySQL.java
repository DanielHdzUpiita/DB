package pantallas.de.bd;
import java.sql.*;
import java.util.ArrayList;

public class ConexionMySQL {
    public static Connection conectar() 
        {
            Connection conexion = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/proyectofinal";
                conexion=DriverManager.getConnection(url,"root","malinali");
                // Si lo abrio
                if(!conexion.isClosed())
                {
                    System.out.println("Si se pudo realizar la conexion");
                }
            }
            catch(SQLException e){  }
            catch(Exception ex){    }
            finally
            {
                return conexion;
            }
        }
}
