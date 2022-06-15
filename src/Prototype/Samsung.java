/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author Leslie Rojas
 */
public class Samsung extends Celular {

    private double costo;

    public Samsung(double costo, String marca, String tamaño, String peso, double precio) {
        super(marca, tamaño, peso, precio);
        setCosto(costo);
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
