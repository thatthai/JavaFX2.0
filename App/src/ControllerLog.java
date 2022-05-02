import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import animatefx.animation.*;

public class ControllerLog {

    @FXML
    private Button ButtonBack;

    @FXML
    private Button ButtonLogin;

    @FXML
    private Button ButtonNext;

    @FXML
    private Button ButtonSingUp;

    @FXML
    private PasswordField EnterConfirmPassId;

    @FXML
    private TextField EnterNameId;

    @FXML
    private PasswordField EnterPassId;

    @FXML
    private ImageView ImageBack;

    @FXML
    private ImageView Logo;

    @FXML
    private ImageView MLElement1;

    @FXML
    private PasswordField PassId;

    @FXML
    private TextField UsernameId;

    @FXML
    private ImageView buttonExit;

    @FXML
    private ImageView buttonExit1;

    @FXML
    private Pane pnlLogin;

    @FXML
    private Pane pnlRegister;
    
    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource().equals(ButtonSingUp))
        {   
            new ZoomIn(pnlRegister).play();
            pnlRegister.toFront();
        }

    }

    @FXML
    void handleMouseClick(MouseEvent event) {
        if(event.getSource() == buttonExit || event.getSource() == buttonExit1){
            System.exit(0);
        }
        if(event.getSource().equals(ButtonBack)){
            new ZoomIn(pnlLogin).play();
            pnlLogin.toFront();
        }
    }

}
