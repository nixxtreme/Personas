import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonaDAO {

    public void insertPersona(String nombre, String aP, String aM, String edad, String telefono, String email, String direccion){
        String sql =  "INSERT INTO PERSONA(NOMBRE, APELLIDOP, APELLIDOM, EDAD, TELEFONO, EMAIL, DIRECCION) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try(Connection conn = MySQLConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, nombre);
            pstmt.setString(2, aP);
            pstmt.setString(3, aM);
            pstmt.setString(4, edad);
            pstmt.setString(5, telefono);
            pstmt.setString(6, email);
            pstmt.setString(7, direccion);
            pstmt.executeUpdate();
            System.out.println("´Persona ha sido agregado exitosamente");
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error el guardar persona " + e.getMessage());
        }

    }

    public ArrayList<Persona> obtenerPersonas(){
        String sql = "SELECT NOMBRE, APELLIDOP, APELLIDOM, EDAD, TELEFONO, EMAIL, DIRECCION FROM PERSONA";
        ArrayList<Persona> personasQuery = new ArrayList<Persona>();
        try(Connection conn = MySQLConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()){
            while(rs.next()){
                Persona personaQuery = new Persona(
                        rs.getString("NOMBRE"), rs.getString("APELLIDOP"), rs.getString("APELLIDOM"),
                        Integer.parseInt(rs.getString("EDAD")), rs.getString("TELEFONO"), rs.getString("EMAIL"),
                        rs.getString("DIRECCION")
                );
                personasQuery.add(personaQuery);
            }

        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error el guardar persona " + e.getMessage());
        }

        return  personasQuery;
    }
}
