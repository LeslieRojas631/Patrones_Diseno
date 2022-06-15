/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author Leslie Rojas
 */
public class iPhone extends Celular {
    private String capacidad;
    private double costoFabricacion;

    public iPhone(String capacidad, double costoFabricacion, String marca, String tamaño, String peso, double precio) {
        super(marca, tamaño, peso, precio);
        setCapacidad(capacidad);
        setCostoFabricacion (costoFabricacion);
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }
    
    
    
}
