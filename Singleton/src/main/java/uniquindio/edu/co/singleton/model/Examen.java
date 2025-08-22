package uniquindio.edu.co.singleton.model;

public class Examen {

    /**
     * Dependencia al puerto de notificación
     */
    private final INotificable notificador;

    /**
     * Constructor de la clase Examen con inyección de dependencia
     * @param notificador implementación de INotificable
     */
    public Examen(INotificable notificador){
        this.notificador=notificador;
    }

    /**
     * Metodo que permite notificar un examen
     * @param estudiante
     * @param nota
     */
    public void notificarExamen(String estudiante, double nota){
        notificador.notificar("El estudiante " + estudiante + " obtuvo una nota de " + nota);
    }

}
