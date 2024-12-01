import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    //URL de conexión a BD
    private static final String URL = "jdbc:mysql://localhost:3306/java";
    private static final String USER = "root";
    private static final String PASSWORD = "ALMApodrida2379";

    public static Connection getConnection() throws SQLException{
        //Registro de driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Error al registrar el driver: " + e.getMessage());
        }
        //Establecer conexión
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
