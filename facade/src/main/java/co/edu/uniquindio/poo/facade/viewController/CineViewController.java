package co.edu.uniquindio.poo.facade.viewController;

import co.edu.uniquindio.poo.facade.controller.CineController;
import co.edu.uniquindio.poo.facade.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CineViewController {

    private App app;
    private CineController cineController;

    @FXML
    private Button btnVerPelicula;

    @FXML
    private Button btnTerminarPelicula;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TextArea txtLog;

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {
        cineController = new CineController();
    }

    @FXML
    void onVerPelicula() {
        txtLog.appendText(cineController.iniciar());
    }

    @FXML
    void onTerminarPelicula() {
        txtLog.appendText(cineController.detener());
    }

    @FXML
    void onLimpiar() {
        txtLog.clear();
    }

}
