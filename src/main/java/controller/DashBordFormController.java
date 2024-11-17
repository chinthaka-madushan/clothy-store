package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashBordFormController {

    @FXML
    private AnchorPane dashBordComponent;

    @FXML
    private JFXButton lblDate;

    @FXML
    private JFXButton lblTime;

    @FXML
    private JFXButton lblUserName;

    @FXML
    void btnEmployee(ActionEvent event) {

    }

    @FXML
    void btnHome(ActionEvent event) {
        try {
            AnchorPane x = FXMLLoader.load(getClass().getResource("../view/component/homepage-admin.fxml"));
            dashBordComponent.getChildren().setAll(x);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnItem(ActionEvent event) {

    }

    @FXML
    void btnLogout(ActionEvent event) {

    }

    @FXML
    void btnReport(ActionEvent event) {

    }

    @FXML
    void btnSupplier(ActionEvent event) {

    }

}
