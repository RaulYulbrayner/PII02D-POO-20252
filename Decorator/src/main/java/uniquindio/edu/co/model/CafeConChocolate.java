package uniquindio.edu.co.model;

public class CafeConChocolate extends CafeDecorador {
    public CafeConChocolate(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + Chocolate ";
    }

    @Override
    public double getValor() {
        return cafe.getValor() + 2000;
    }
}
