import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EntryPointController {

    @FXML
    AnchorPane anchor;

    public EntryPointController() {
    }

    public void click_register_partener(ActionEvent event) {
        this.goToPage("partner_login_page.fxml",600,671);
    }

    public void click_register_student(ActionEvent event) {
        this.goToPage("student_register_page.fxml",600,671);
    }

    public void click_partener(ActionEvent event) {
        this.goToPage("login_page.fxml",600,400);
    }

    public void click_prof(ActionEvent event) {
        this.goToPage("login_page.fxml",600,400);
    }

    public void click_student(ActionEvent event) {
        this.goToPage("login_page.fxml",600,400);
    }

    public void goToPage(String page, int width, int height){
        try {
            anchor.getScene().getWindow().hide();
            Parent root;
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            root = loader.load();
                LoginController controller = loader.getController();
            //  controller.setService(service,user);
            // service.login(user, controller);
            Scene scene = new Scene(root, width, height);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            System.out.println("ceva nu a fost ok");
        }
    }
}
