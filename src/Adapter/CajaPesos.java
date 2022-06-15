/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Leslie Rojas
 */
public class CajaPesos {

    private double pesos = 0;

    public CajaPesos() {
    }

    public double getTotalPesos() {
        return this.pesos;
    }

    public void sacarPesos(double euros) {
        this.pesos -= pesos;
    }

    public void ingresarPesos(double pesos) {
        this.pesos += pesos;
    }
}

