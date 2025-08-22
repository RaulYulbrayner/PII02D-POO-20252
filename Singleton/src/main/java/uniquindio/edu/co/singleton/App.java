package uniquindio.edu.co.singleton;

import uniquindio.edu.co.singleton.model.*;

public class App {

    public static void main(String args[]){

        //Una sola instancia para toda la plataforma de notificación
        INotificable notificacionGlobal = Notificacion.getInstance();

        Examen examen = new Examen(notificacionGlobal);
        Evento evento = new Evento(notificacionGlobal);
        Nota nota = new Nota(notificacionGlobal);

        //DEMO
        examen.notificarExamen("Raul", 2.9);
        evento.notificarEvento("Java para Todos", "22/08/2025");
        nota.notificarNota("Juan", "Programación II", 5.0);

        System.out.println(notificacionGlobal == Notificacion.getInstance());

    }

}
