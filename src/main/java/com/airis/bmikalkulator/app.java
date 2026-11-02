/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airis.bmikalkulator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author airis
 */
public class app extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(
                app.class.getResource("bmiView.fxml"));

        Scene scene = new Scene(
                fxmlLoader.load());

        stage.setTitle("Kalkulator BMI");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
