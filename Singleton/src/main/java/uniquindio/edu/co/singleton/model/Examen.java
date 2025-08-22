package uniquindio.edu.co.singleton.model;

public class Examen {

    private final INotificable notificador;

    public Examen(INotificable notificador){
        this.notificador=notificador;
    }

    public void notificarExamen(String estudiante, double nota){
        notificador.notificar("El estudiante " + estudiante + " obtuvo una nota de " + nota);
    }


}
