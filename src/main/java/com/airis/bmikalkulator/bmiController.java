/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airis.bmikalkulator;

/**
 *
 * @author LENOVO
 */
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class bmiController {

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private Label lblHasil;

    @FXML
    private void hitungBmi() {

        try {

            double berat = Double.parseDouble(
                    txtBerat.getText());

            double tinggi = Double.parseDouble(
                    txtTinggi.getText());

            if (berat <= 0) {
                throw new inputBmiException(
                        "Berat harus lebih dari 0");
            }

            if (tinggi <= 0) {
                throw new inputBmiException(
                        "Tinggi harus lebih dari 0");
            }

            bmi dataBmi = new bmi(berat, tinggi);

            double hasilBMI = dataBmi.hitungBmi();

            String kategori =
                    dataBmi.kategoriBmi();

            lblHasil.setText(
                    String.format(
                            "BMI = %.2f (%s)",
                            hasilBMI,
                            kategori));

        } catch (NumberFormatException e) {

            tampilError(
                    "Input harus berupa angka");

        } catch (inputBmiException e) {

            tampilError(
                    e.getMessage());
        }
    }

    private void tampilError(String pesan) {

        Alert alert =
                new Alert(Alert.AlertType.ERROR);

        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(pesan);

        alert.showAndWait();
    }
}
