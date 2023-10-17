package com.example.practicaobligatoria;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class GestionUsuarios implements Initializable{
    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnBorrar;

    @FXML
    private Button btnEditar;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtClave;
    @FXML
    private TableView<Usuario> tblUsuarios;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colApellidos;
    @FXML
    private TableColumn colClave;

    private ObservableList<Usuario> usuarios;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Creo el observablelist
        usuarios = FXCollections.observableArrayList();

        // Asigno las columnas con los atributos del modelo
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.colClave.setCellValueFactory(new PropertyValueFactory("contraseña"));
    }

    @FXML
    private void agregarUsuario(ActionEvent event) {

           // Obtengo los datos del formulario
            String nombre = this.txtNombre.getText();
            String apellidos = this.txtApellidos.getText();
            String clave = this.txtClave.getText();

            // Creo un Usuario
            Usuario u = new Usuario(nombre, apellidos, clave );
                // Lo añado a la lista
            this.usuarios.add(u);
            // Seteo los items
            this.tblUsuarios.setItems(usuarios);

    }
    @FXML
    private void editarUsuario(ActionEvent event) {

        // Obtengo los datos del formulario
        String nombre = this.txtNombre.getText();
        String apellidos = this.txtApellidos.getText();
        String clave = this.txtClave.getText();

        // Creo un Usuario
        Usuario u = new Usuario(nombre, apellidos, clave );
        // Lo añado a la lista
        this.usuarios.add(u);
        // Seteo los items
        this.tblUsuarios.setItems(usuarios);

    }
    @FXML
    private void borrarUsuario(ActionEvent event) {
        // Se selecciona un usuario en la tabla y se obtiene el usuario seleccionado
        Usuario usuarioSeleccionado = tblUsuarios.getSelectionModel().getSelectedItem();

        // Verifica si se ha seleccionado un usuario
        if (usuarioSeleccionado != null) {
            // Remueve el usuario de la lista
            usuarios.remove(usuarioSeleccionado);

            // Se borra el usuario de la tabla
            tblUsuarios.setItems(FXCollections.observableArrayList(usuarios));
        } else {
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("ERROR");
            error.setHeaderText("Ningun Usuario seleccionado");
            error.showAndWait();
        }
    }


}