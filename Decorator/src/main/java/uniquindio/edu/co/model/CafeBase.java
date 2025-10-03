package uniquindio.edu.co.model;

public class CafeBase implements ICafe {

    @Override
    public String getDescripcion() {
        return "Huevos"; // ref cafe
    }

    @Override
    public double getValor() {
        return 1500; // ref del valor de ese cafe
    }
}
