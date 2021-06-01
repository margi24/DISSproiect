import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {
    
    @FXML
    TextField username_textfield;
    @FXML
    AnchorPane anchor;

    public LoginController() {
    }

    public void signIn_btn_click(ActionEvent event) {
        if (username_textfield.getText().equals("a")) {
            this.goToPage("student_menu_page.fxml",604,477);
        }
        else {
            this.goToPage("student_menu_page.fxml",604,477);
        }
    }

    private void goToPage(String page, int width, int height) {
        try {
            anchor.getScene().getWindow().hide();
            Parent root;
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            root = loader.load();
            //    ControllerBilet controller = loader.getController();
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
