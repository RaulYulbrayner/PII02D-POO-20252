package uniquindio.edu.co.singleton.model;

public final class Notificacion implements INotificable {

    /**
     * Instancia de la clase
     */
    private static Notificacion instance;

    /**
     * Constructor de la clase Notificacion que no permite crear instancias externas
     */
    private Notificacion() {}

    /**
     *
     * @return
     */
    public static Notificacion getInstance() {
        if (instance == null) {
            instance = new Notificacion();
        }
        return instance;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("NOTIFICACIÓN: " + mensaje);
    }
}
