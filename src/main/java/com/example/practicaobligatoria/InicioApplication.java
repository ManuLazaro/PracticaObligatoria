package com.example.practicaobligatoria;

import com.example.practicaobligatoria.util.R;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Properties;

public class InicioApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InicioApplication.class.getResource("PantallaInicial.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("NBA Manager");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        try{

            Properties configuration = new Properties();
            configuration.load(R.getProperties("database.properties"));
            String host = configuration.getProperty("host");
            String port = configuration.getProperty("port");
            String name = configuration.getProperty("name");
            String username = configuration.getProperty("username");
            String password = configuration.getProperty("password");
            System.out.println(host+"  "+port+"  "+name+"  "+username+"  "+password);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        launch();

    }
}