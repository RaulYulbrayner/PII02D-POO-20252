package co.edu.uniquindio.poo.facade.model;

public class Sonido implements IGestionable {

    @Override
    public void encender() {
        System.out.println("Sonido activado");
    }

    @Override
    public void apagar() {
        System.out.println("Sonido apagado");
    }

}
