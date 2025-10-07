package co.edu.uniquindio.poo.facade;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class App extends Application{

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Cine en Casa - Facade");
        openViewPrincipal();
    }

    private void openViewPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("primary.fxml"));
            javafx.scene.layout.VBox rootLayout = loader.load();
            co.edu.uniquindio.poo.facade.viewController.PrimaryController controller = loader.getController();
            controller.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openCineView() {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("cineView.fxml"));
            AnchorPane rootLayout = loader.load();
            co.edu.uniquindio.poo.facade.viewController.CineViewController controller = loader.getController();
            controller.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
