module uniquindio.edu.co.singleton {
    requires javafx.controls;
    requires javafx.fxml;


    opens uniquindio.edu.co.singleton to javafx.fxml;
    exports uniquindio.edu.co.singleton;
}