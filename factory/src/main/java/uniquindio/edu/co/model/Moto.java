package uniquindio.edu.co.model;

public class Moto implements Vehiculo {

    private int cilindraje;

    public Moto(int cilindraje){
        this.cilindraje=cilindraje;
    }

    @Override
    public void conducir() {
        System.out.println("Moto conducioendo");
    }

    @Override
    public void entregar() {

    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
