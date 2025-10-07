module co.edu.uniquindio.poo.facade {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.facade to javafx.fxml;
    exports co.edu.uniquindio.poo.facade;

    exports co.edu.uniquindio.poo.facade.viewController;
    opens   co.edu.uniquindio.poo.facade.viewController to javafx.fxml;
}