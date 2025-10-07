package co.edu.uniquindio.poo.facade.controller;

import co.edu.uniquindio.poo.facade.model.CineCasaFacade;
import co.edu.uniquindio.poo.facade.model.Luces;
import co.edu.uniquindio.poo.facade.model.Sonido;
import co.edu.uniquindio.poo.facade.model.Televisor;

public class CineController {

    private final CineCasaFacade facade;

    public CineController() {
        this.facade = new CineCasaFacade(new Televisor(), new Luces(), new Sonido());
    }

    public String iniciar() {
        return facade.verPelicula();
    }

    public String detener() {
        return facade.terminarPelicula();
    }

}
