package co.edu.uniquindio.poo.facade.viewController;

import co.edu.uniquindio.poo.facade.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    private App app;

    @FXML
    private Button primaryButton;

    @FXML
    void onOpenCineView() {
        app.openCineView();
    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {
        // No-op
    }
}

