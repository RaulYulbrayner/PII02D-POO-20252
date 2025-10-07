package co.edu.uniquindio.poo.facade.model;

public class CineCasaFacade {

    private final Televisor tv;
    private final Luces luces;
    private final Sonido sonido;

    public CineCasaFacade(Televisor tv, Luces luces, Sonido sonido) {
        this.tv = tv;
        this.luces = luces;
        this.sonido = sonido;
    }

    public String verPelicula() {
        StringBuilder log = new StringBuilder();
        log.append("Preparando para ver la película...\n");
        luces.encender();             log.append(" - Luces: modo cine\n");
        tv.encender();                log.append(" - TV: encendida\n");
        sonido.encender();            log.append(" - Sonido: activado\n");
        log.append("¡Disfruta tu película!\n");
        return log.toString();
    }

    public String terminarPelicula() {
        StringBuilder log = new StringBuilder();
        log.append("Terminando la película...\n");
        sonido.apagar();              log.append(" - Sonido: apagado\n");
        tv.apagar();                  log.append(" - TV: apagada\n");
        luces.encender();             log.append(" - Luces: encendidas\n");
        log.append("Cine apagado correctamente.\n");
        return log.toString();
    }

}
