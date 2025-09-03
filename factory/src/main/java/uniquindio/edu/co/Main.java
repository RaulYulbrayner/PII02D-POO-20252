package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //---- Moto
        CreadorVehiculo creadorVehiculo = new CreadorVehiculo();
        Vehiculo vehiculo1 = creadorVehiculo.crearVehiculo("Moto");
        vehiculo1.conducir();
        if(vehiculo1 instanceof Moto){
            Moto moto = (Moto) vehiculo1;
            System.out.println("Cilindraje de la moto: " + moto.getCilindraje());
        }

        //---- Carro
        Vehiculo vehiculo2 = creadorVehiculo.crearVehiculo("Carro");
        vehiculo2.conducir();

        if(vehiculo2 instanceof Carro){
            Carro carro = (Carro) vehiculo2;
            System.out.println("Placa del carro: " + carro.getPlaca());
            System.out.println("Modelo del carro: " + carro.getModelo());
        }

        //---- Mota
        Vehiculo vehiculo3 = creadorVehiculo.crearVehiculo("Mota");
        vehiculo3.conducir();
        if(vehiculo3 instanceof Mota){
            Mota mota = (Mota) vehiculo3;
            System.out.println("Descripción de la mota: " + mota.getDescripcion());
        }


    }

}