package uniquindio.edu.co.model;

public class CreadorVehiculo {

    public Vehiculo crearVehiculo(String tipo){

        if("Carro".equals(tipo)){
            String placa = "BB123";
            String modelo = "2025";
            return new Carro(placa);

        }else if("Moto".equals(tipo)){
            int cilindraje = 125;
            return new Moto(cilindraje);

        }else if("Mota".equals(tipo)){
            String descripcion = "Mota eléctrica de prueba";
            return new Mota(descripcion);
        }else{
            System.out.println("No valido");
        }
        return null;
    }

}
