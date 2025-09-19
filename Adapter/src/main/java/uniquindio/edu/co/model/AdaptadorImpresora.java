package uniquindio.edu.co.model;

public class AdaptadorImpresora implements Impresora {

    private ImpresoraVieja impresoraVieja;

    public AdaptadorImpresora(ImpresoraVieja impresoraVieja) {
        this.impresoraVieja = impresoraVieja;
    }

    @Override
    public void imprimir(String mensaje) {
        //traduce la llamada al metodo de la clase vieja
        impresoraVieja.imprimirMayusculas(mensaje);
    }

    @Override
    public void red(String red) {
        impresoraVieja.red("NO TENGO RED: " + red);
    }
}
