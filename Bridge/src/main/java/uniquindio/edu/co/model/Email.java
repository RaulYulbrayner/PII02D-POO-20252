package uniquindio.edu.co.model;

public class Email implements IMensajeNotificable {

    @Override
    public void enviarMensaje(String asunto, String cuerpo) {
        System.out.println("[EMAIL -]" + " Asunto: " + asunto + " Cuerpo: "+cuerpo);
    }

}
