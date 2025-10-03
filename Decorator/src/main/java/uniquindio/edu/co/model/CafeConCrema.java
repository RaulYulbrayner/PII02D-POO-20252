package uniquindio.edu.co.model;

public class CafeConCrema extends CafeDecorador {

    public CafeConCrema(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + Crema ";
    }

    @Override
    public double getValor() {
        return cafe.getValor() + 500;
    }


}
