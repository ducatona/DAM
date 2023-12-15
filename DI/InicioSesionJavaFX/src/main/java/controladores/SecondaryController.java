package controladores;

import main.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController {

    @FXML
    private Button secondaryButton;
    @FXML
    private Button miboton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void clickmiboton(ActionEvent event) {
        
        miboton.setText("asdgavsdsvhad");
    }
}