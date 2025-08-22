package uniquindio.edu.co.singleton.model;

public final class Notificacion implements INotificable {

    /**
     * Instancia unica de la clase
     */
    private static Notificacion instance;

    /**
     * Constructor de la clase Notificacion que no permite crear instancias externas
     */
    private Notificacion() {}

    /**
     * Punto de acceso global de la instancia unica
     * @return
     */
    public static Notificacion getInstance() {
        if (instance == null) {
            instance = new Notificacion();
        }
        return instance;
    }

    /**
     * Envia una notificación por consola
     * @param mensaje contenido de la notificación
     */
    @Override
    public void notificar(String mensaje) {
        System.out.println("NOTIFICACIÓN: " + mensaje);
    }
}
