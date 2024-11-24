public class Persona {
    String nombre;
    String apellidoP;
    String apellidoM;
    int edad;
    String telefono;
    String email;
    String direccion;

    //Constructor sin parámetros con Strings = "Indefinido", int = 0;
    public Persona(){
        nombre = "Indefinido";
        apellidoP = "Indefinido";
        apellidoM = "Indefinido";
        edad = 0;
        telefono = "Indefinido";
        email = "Indefinido";
        direccion = "Indefinido";
    }
    //Constructor que recibe nombre y apellidos
    public Persona(String nombre, String apellidoP, String apellidoM){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;

    }
    //Constructor que recibe nombre, apellidos y edad

    //Constructor que recibe todos los datos
    public Persona(String nombre, String apellidoP, String apellidoM, int edad, String telefono, String email, String direccion){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
