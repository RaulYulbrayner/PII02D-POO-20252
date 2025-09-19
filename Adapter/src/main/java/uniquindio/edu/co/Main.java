package uniquindio.edu.co;

import uniquindio.edu.co.model.AdaptadorImpresora;
import uniquindio.edu.co.model.Impresora;
import uniquindio.edu.co.model.ImpresoraVieja;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tenemos un objeto del sistema antiguo
        ImpresoraVieja impresoraVieja = new ImpresoraVieja();

        // Lo adaptamos para que funcione con la interfaz nueva
        Impresora impresora = new AdaptadorImpresora(impresoraVieja);

        // Ahora podemos usarlo como si fuera el sistema nuevo
        impresora.imprimir("hola muchachos como estan...........");
        String red = "ERROR 404";
        impresora.red(red);

    }
}