/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author Leslie Rojas
 */
public abstract class Celular implements Cloneable {

    private String marca;
    private String tamaño;
    private String peso;
    private double precio;

    public Celular(String marca, String tamaño, String peso, double precio) {
        setMarca(marca);
        setTamaño(tamaño);
        setPeso(peso);
        setPrecio(precio);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
