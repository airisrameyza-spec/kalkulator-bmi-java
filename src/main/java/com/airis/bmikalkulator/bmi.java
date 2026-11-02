/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airis.bmikalkulator;

/**
 *
 * @author LENOVO
 */
public class bmi {
    private double berat;
    private double tinggi;

    public bmi(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public double hitungBmi() {
        return berat / (tinggi * tinggi);
    }

    public String kategoriBmi() {

        double bmi = hitungBmi();

        if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Gemuk";
        } else {
            return "Obesitas";
        }
    }
}
