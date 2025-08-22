package uniquindio.edu.co.singleton.model;

public class Nota {

    /**
     * Dependencia al puerto de notificación
     */
    private final INotificable notificador;

    /**
     * Constructor de la clase Nota con inyección de dependencia
     * @param notificador implementación de INotificable
     */
    public Nota(INotificable notificador){
        this.notificador=notificador;
    }

    /**
     * Metodo que permite notificar notas
     * @param estudiante nombre del estudiante
     * @param curso nombre del curso
     * @param valor de la nota
     */
    public void notificarNota(String estudiante, String curso, double valor){
        notificador.notificar("Se publico la nota " + valor + " para " + estudiante + " en " + curso);
    }

}
