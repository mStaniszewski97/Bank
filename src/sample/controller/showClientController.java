package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.model.bankClass.KlientFirmowy;
import sample.model.bankClass.KlientPrywatny;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.controller.clientController.pomId;
import static sample.model.main.Main.*;

public class showClientController implements Initializable {
    private Stage stage;

    @FXML
    private Label infoLabel;

    @FXML
    private Button backButton;

    @FXML
    private Label adresLabel;

    @FXML
    private Label contactLabel;


    @FXML
    void addAccClick(ActionEvent event) {

    }

    @FXML
    void backClick(ActionEvent event) throws IOException {
        stage = (Stage) backButton.getScene().getWindow();
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/sample/view/clientPane.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void delAccClick(ActionEvent event) {

    }

    @FXML
    void editContactClick(ActionEvent event) {

    }

    @FXML
    void showAllClick(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        KlientPrywatny pomClient = getPrivClientById(pomId);
        KlientFirmowy pomCompany = getCompanyById(pomId);
        if(pomClient!=null){
            infoLabel.setText(pomClient.info());
            adresLabel.setText(pomClient.getAdressInfo());
            contactLabel.setText(pomClient.getContactInfo());
        }
        else{
            infoLabel.setText(pomCompany.info());
            adresLabel.setText(pomCompany.getAdressInfo());
            contactLabel.setText(pomCompany.getContactInfo());
        }
    }
}
