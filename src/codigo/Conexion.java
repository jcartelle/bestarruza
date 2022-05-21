package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta clase nos servirá para conectar el proyecto con la base de datos de MySQL
 * @author bea
 * 
 */
public class Conexion {
    
    /**
     * Conexión: Variable privada y estática que declaramos para realizar la conexión con la base de datos. La declaramos dentro de la clase para poder utilizarla en toda ella
     */
   
    private static Connection conexion;

    /**
     * Método Connection se utiliza para conectar el proyecto con la base de datos 
     * @param url: IP donde se ubica el servidor de la base de datos
     * @param puerto: Puerto utilizado por el servidor de la base de datos
     * @param usuario: Usuario con el que se accede a la base de datos
     * @param bd: Nombre de la base de datos
     * @param clave: Contraseña de la base de datos
     * @return El método devuelve un valor entero, 0 si la conexión se realiza correctamente, -1 si encuentra una excepción de SQL y -2 si no encuentra la clase  
     */
    
    public static int conectar(String url,String puerto,String usuario,String bd,String clave){
        
        try 
        {            
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver"); //Carga la clase en memoria (la de la libreria) 
            
            String cadenaConexion="jdbc:mysql://"+url+":"+puerto+"/"+bd+"?user="+usuario+"&password="+clave;
            //Mostramos por pantalla para ver posibles errores. 
            System.out.println("Cadena de conexion:"+cadenaConexion);
            
            //Lanzar contra la base de datos, llamamos a la clase DriverManager y llamamos al método getConnection pasando como parametro la cadenaConexion. 
            conexion=DriverManager.getConnection(cadenaConexion);
            return 0; //Si el método devuelve 0 todo está OK, si devuelve otra cosa ERROR. 
        } 
        catch (SQLException e)  //Error de tipo usuario incorrecto, base de datos no responde (relacionados con la base de datos)
        {
            e.printStackTrace();
            return -1;
        }
        catch (ClassNotFoundException e) //Se da cuando hay algun error con la libreria introducida. 
        {
            e.printStackTrace();
            return -2;
        }
    }    
    
    /**
     * El método getConexion() devuelve la conexión 
     * @return conexion
     */
    
    public static Connection getConexion()
    {
        return conexion;
    }
    
}

