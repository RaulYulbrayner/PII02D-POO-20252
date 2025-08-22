package uniquindio.edu.co.singleton;

import uniquindio.edu.co.singleton.model.Examen;
import uniquindio.edu.co.singleton.model.INotificable;
import uniquindio.edu.co.singleton.model.Notificacion;

public class App {

    public static void main(String args[]){

        INotificable notificacionGlobal = Notificacion.getInstance();

        Examen examen = new Examen(notificacionGlobal);

        examen.notificarExamen("Raul", 2.9);

        System.out.println(notificacionGlobal == Notificacion.getInstance());

    }

}
