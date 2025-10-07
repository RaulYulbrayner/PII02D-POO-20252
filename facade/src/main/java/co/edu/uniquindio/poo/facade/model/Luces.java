package co.edu.uniquindio.poo.facade.model;

public class Luces implements IGestionable {

    @Override
    public void encender() {
        System.out.println("Luces en modo cine");
    }

    @Override
    public void apagar() {
        System.out.println("Luces apagadas");
    }
}
