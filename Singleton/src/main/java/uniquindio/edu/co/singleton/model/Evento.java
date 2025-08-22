package uniquindio.edu.co.singleton.model;

public class Evento {

    /**
     * Dependencia al puerto de notificación
     */
    private final INotificable notificador;

    /**
     * Constructor de la clase evento con inyección de dependencia
     * @param notificador implementación de INotificable
     */
    public Evento(INotificable notificador){
        this.notificador=notificador;
    }

    /**
     * Metodo que permite notificar un evento
     * @param titulo
     * @param fecha
     */
    public void notificarEvento(String titulo, String fecha){
        notificador.notificar("El evento " + titulo + " se realizara el " + fecha);
    }

}
