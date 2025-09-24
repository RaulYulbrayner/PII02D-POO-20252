package uniquindio.edu.co.model;

public class NotificacionPago extends Notificacion {

    public NotificacionPago(IMensajeNotificable mensajeNotificable) {
        super(mensajeNotificable);
    }

    @Override
    public void notificar(String destinatario, String contenido) {
        String asunto = "El pago fue realizado por: " + destinatario;
        String cuerpo = "El valor valor del pago es de: " + contenido;
        mensajeNotificable.enviarMensaje(asunto,cuerpo);
    }
}
