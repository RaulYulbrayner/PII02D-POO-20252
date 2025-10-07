package co.edu.uniquindio.poo.facade.model;

public class Televisor implements IGestionable {

    @Override
    public void encender() {
        System.out.println("Televisor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor apagado");
    }

}
