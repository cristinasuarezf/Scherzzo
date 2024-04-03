package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Fer
 */
public class conectar {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/scherzzo";

    public conectar() {
        conn = null;

        try{
            Class.forName(driver);  
            conn = DriverManager.getConnection(url, user, password);
            
            if(conn != null){
                System.out.println("Conexion establecida");
            }
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar: " + e);
        }
    }
    
    //Este metodo nos retorna la conexion
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Conexion terminada");
        }
    }

    public ArrayList<String> obtenerClases() throws SQLException {
    ArrayList<String> clases = new ArrayList<String>();
    String sql = "SELECT nombre_clase FROM clase";
    Statement stmt = conn.createStatement();
    ResultSet resultado = stmt.executeQuery(sql);
    while (resultado.next()) {
        String nombreClase = resultado.getString("nombre_clase");
        clases.add(nombreClase);
    }
    return clases;
}

}
