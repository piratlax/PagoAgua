package utilerias;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {
  Connection conn = null;  
  
  public Connection conecta() {
               
       try{
         //obtenemos el driver para Access 
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión         
         conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pago_de_agua","root","barbara2401");
         //si la conexion tuvo exito
         if (conn!=null){
            System.out.println("Conexión a base de datos");
            
         }
      }catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }
       return conn;
   }
  public void desconectar(){
        try {
            conn.close();
            //conn = null;
            System.out.println("La conexion a la  base de datos alumnos a terminado");
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
}
