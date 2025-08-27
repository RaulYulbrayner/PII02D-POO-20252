package uniquindio.edu.co.model;

public class Estudiante implements Cloneable {

    private String nombre;
    private String apellido;
    private String genero;
    private String email;
    private String cedula;

    //Constructor con un parametro
    public Estudiante(String nombre){
        this.nombre=nombre;
    }

    //Constructor con dos parametros
    public Estudiante(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    //Constructor con tres parametros
    public Estudiante(String nombre, String apellido, String genero){
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
    }

    //Constructor con cuatro parametros
    public Estudiante(String nombre, String apellido, String genero, String cedula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
        this.cedula=cedula;
    }

    public Estudiante clone() throws CloneNotSupportedException {
        return (Estudiante) super.clone();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero='" + genero + '\'' +
                ", email='" + email + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
