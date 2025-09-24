package uniquindio.edu.co.model;

public class SMS implements IMensajeNotificable {

    @Override
    public void enviarMensaje(String asunto, String cuerpo) {
        System.out.println("[SMS -]" + " Asunto: " + asunto + " Cuerpo: "+cuerpo);
    }

}
