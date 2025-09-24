package uniquindio.edu.co.model;

public class NotificacionPedido extends Notificacion {

    public NotificacionPedido(IMensajeNotificable mensajeNotificable) {
        super(mensajeNotificable);
    }

    @Override
    public void notificar(String destinatario, String contenido) {
        String asunto = "El pedido fue realizado por: " + destinatario;
        String cuerpo = "El detalle del pedido es: " + contenido;
        mensajeNotificable.enviarMensaje(asunto, cuerpo);
    }
}
