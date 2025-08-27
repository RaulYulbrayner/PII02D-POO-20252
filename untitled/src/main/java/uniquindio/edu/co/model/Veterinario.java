package uniquindio.edu.co.model;

public class Veterinario {

    private String nombre, cedula, telefeno;

    public Veterinario(String nombre, String cedula, String telefeno){
        this.nombre=nombre;
        this.cedula=cedula;
        this.telefeno=telefeno;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefeno='" + telefeno + '\'' +
                '}';
    }
}
