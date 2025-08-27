package uniquindio.edu.co.model;

public class Propietario {

    private String nombre, cedula, telefeno;

    public Propietario(String nombre, String cedula, String telefeno) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefeno = telefeno;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
