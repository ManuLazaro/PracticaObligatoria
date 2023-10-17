package com.example.practicaobligatoria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipal {

    @FXML
    private Button btnGestionUsuarios;

    @FXML
    private Button btnCambiarClave;

    @FXML
    private Button btnCambiarNomUsuario;

    @FXML
    private Button btnVolver;

    @FXML
    void GestionUsuarios(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("GestionUsuarios.fxml"));
        try {
            Parent root = (Parent)fxmlLoader.load();
            GestionUsuarios controlador = fxmlLoader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Gestion Usuarios");
            stage.setScene(scene);
            stage.show();
        } catch (IOException var7) {
            throw new RuntimeException(var7);
        }

        Stage stagePrincipal = (Stage) btnGestionUsuarios.getScene().getWindow();
        stagePrincipal.close();
    }

    @FXML
    void cambiarClave(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("CambiarClave.fxml"));
        try {
            Parent root = (Parent)fxmlLoader.load();
            CambiarClave controlador = fxmlLoader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Cambiar Clave");
            stage.setScene(scene);
            stage.show();
        } catch (IOException var7) {
            throw new RuntimeException(var7);
        }

        Stage stagePrincipal = (Stage) btnCambiarClave.getScene().getWindow();
        stagePrincipal.close();
    }

    @FXML
    void cambiarNomUsuario(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("CambiarNombreUsuario.fxml"));
        try {
            Parent root = (Parent)fxmlLoader.load();
            CambiarNombreUsuario controlador = fxmlLoader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Cambiar Nombre");
            stage.setScene(scene);
            stage.show();
        } catch (IOException var7) {
            throw new RuntimeException(var7);
        }

        Stage stagePrincipal = (Stage) btnCambiarNomUsuario.getScene().getWindow();
        stagePrincipal.close();
    }

    @FXML
    void volver(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MenuPrincipal.fxml"));
        try{
            Parent root = fxmlLoader.load();
            InicioController controlador = fxmlLoader.getController();

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