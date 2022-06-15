/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Leslie Rojas
 */
public abstract class Carro {
    private String descripcion;
    private String modelo;
    private String millas;
    private double precio;

    public Carro() {
    }

    public Carro(String modelo, String millas, double precio) {
        setModelo(modelo);
        setMillas(millas);
        setPrecio(precio);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMillas() {
        return millas;
    }

    public void setMillas(String millas) {
        this.millas = millas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
