package uniquindio.edu.co.model;

public class Mota implements Vehiculo{

    private String descripcion;

    public Mota(String descripcion){
        this.descripcion=descripcion;
    }

    @Override
    public void conducir() {
        System.out.println("Esto es una MOTA...............");
    }

    @Override
    public void entregar() {

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
