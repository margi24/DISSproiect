import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ClassLoader.getSystemResource("entry_page.fxml"));
        Parent root;

        root = loader.load();

        //ControllerLogin loginViewController = loader.getController();
    //    loginViewController.setService(server);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Authentication");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
