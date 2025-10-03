package uniquindio.edu.co.model;

public class CafeDecorador implements ICafe {

    protected ICafe cafe;

    public CafeDecorador(ICafe cafe){
        this.cafe=cafe;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion();
    }

    @Override
    public double getValor() {
        return cafe.getValor();
    }
}
