/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Leslie Rojas
 */
public class Adaptador implements IAdaptador {

    CajaPesos cajaPesos = new CajaPesos();

    public Adaptador() {
    }

    public double getSaldo() {
        return this.cajaPesos.getTotalPesos();
    }

    @Override
    public void sacarDolares(double dolares) {
        double pesos = dolares * 19.57;
        cajaPesos.ingresarPesos(pesos);
    }

    @Override
    public void ingresarDolares(double dolares) {
        double pesos = dolares * 19.57;
        cajaPesos.ingresarPesos(pesos);
    }
}


