package uniquindio.edu.co.model;

public abstract class Notificacion {

    //Protegido, solo se accede desde la clase Notificacion
    protected IMensajeNotificable mensajeNotificable;

    //Constructor protegido solo se accede a el las clases subclases
    protected Notificacion(IMensajeNotificable mensajeNotificable){
        this.mensajeNotificable=mensajeNotificable;
    }

    public abstract void notificar(String destinatario, String contenido);


}
