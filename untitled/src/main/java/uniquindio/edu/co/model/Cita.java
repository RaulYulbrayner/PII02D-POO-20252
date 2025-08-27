package uniquindio.edu.co.model;

public class Cita {

    private String fecha, id, hora;
    private Veterinario veterinario;
    private Mascota mascota;
    private Propietario propietario;

    public Cita(String fecha, String id, String hora, Veterinario veterinario, Mascota mascota, Propietario propietario){
        this.fecha=fecha;
        this.id=id;
        this.hora=hora;
        this.veterinario=veterinario;
        this.mascota=mascota;
        this.propietario=propietario;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", id='" + id + '\'' +
                ", hora='" + hora + '\'' +
                ", veterinario=" + veterinario +
                ", mascota=" + mascota +
                ", propietario=" + propietario +
                '}';
    }
}
