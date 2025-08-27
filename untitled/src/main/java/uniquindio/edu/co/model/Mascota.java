package uniquindio.edu.co.model;

public class Mascota {

    private String nombre, raza, id;

    public Mascota(String nombre, String raza, String id) {
        this.nombre = nombre;
        this.raza = raza;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
