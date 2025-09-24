package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Notificacion n1 = new NotificacionPago(new Email());
        n1.notificar("Raul", "100000");

        Notificacion n2 = new NotificacionPago(new SMS());
        n2.notificar("Raul", "100000");

        Notificacion n3 = new NotificacionPedido(new SMS());
        n3.notificar("Juan", "Pollo frito con papas, esta: pendiente");


    }
}