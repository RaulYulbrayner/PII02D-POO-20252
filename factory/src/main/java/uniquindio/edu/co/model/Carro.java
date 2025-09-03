package uniquindio.edu.co.model;

public class Carro implements Vehiculo {

    private String placa, modelo;


    public Carro(String placa, String modelo){
        this.placa=placa;
        this.modelo=modelo;
    }

    public Carro(String placa){
        this.placa=placa;
    }

    @Override
    public void conducir() {
        System.out.println("Carro conducioendo");
    }

    @Override
    public void entregar() {

    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
