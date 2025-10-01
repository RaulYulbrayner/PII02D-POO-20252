package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements IComponenteArchivo {

    private String nombre;
    private double tamanio;
    private List<IComponenteArchivo> hijos = new ArrayList<>();

    public Carpeta(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public void agregarArchivo(IComponenteArchivo componenteArchivo){
        hijos.add(componenteArchivo);
    }

    @Override
    public void mostarArchivo(String identacion) {
        System.out.println(identacion + "+ " + nombre);
        for(IComponenteArchivo hijo : hijos){
            hijo.mostarArchivo(identacion + "  ");
        }
    }
}
