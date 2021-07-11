package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Lname;

    @FXML
    private TextField Fname;

    @FXML
    private TextField Tname;

    @FXML
    private Button Submit;

    @FXML
    private TextArea Output;

    @FXML
    void initialize() {
        Submit.setOnAction(event -> {
            if (!Lname.getText().isEmpty() && !Fname.getText().isEmpty() && !Tname.getText().isEmpty()) {
                Output.appendText(Lname.getText() + " ");
                Output.appendText(Tname.getText() + " ");
                Output.appendText(Fname.getText() + " ");
            }
        });
    }
}

