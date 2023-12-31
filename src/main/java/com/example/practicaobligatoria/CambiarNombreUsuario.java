package com.example.practicaobligatoria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CambiarNombreUsuario {

    @FXML
    private Button btnAplicar;

    @FXML
    private Button btnVolver;

    @FXML
    private TextField txtNuevoNombre;

    @FXML
    void aplicar(ActionEvent event) {
        DBManager.loadDriver();
        DBManager.connect();
        DBManager.isConnected();

        if(DBManager.cambiarNombre(txtNuevoNombre.getText())){
            Alert aviso = new Alert(Alert.AlertType.INFORMATION);
            aviso.setTitle("Exito");
            aviso.setHeaderText("Nombre cambiado correctamente");
            aviso.showAndWait();
        } else {
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("ERROR");
            error.setHeaderText("Ese nombre ya esta en uso");
            error.showAndWait();
        }
        DBManager.close();
    }

    @FXML
    void volver(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Cuenta.fxml"));
        try{
            Parent root = fxmlLoader.load();
            MenuPrincipal controlador = fxmlLoader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("NBA Manager");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        Stage stagePrincipal = (Stage) btnVolver.getScene().getWindow();
        stagePrincipal.close();
    }

}