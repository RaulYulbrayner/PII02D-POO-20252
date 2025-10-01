package uniquindio.edu.co.model;

public class Archivo implements IComponenteArchivo  {

    private String nombre, fecha;
    private double tamanio;

    public Archivo(String nombre, String fecha, double tamanio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tamanio = tamanio;
    }

    @Override
    public void mostarArchivo(String identacion) {
        System.out.println(identacion + "- " + nombre);
    }
}
