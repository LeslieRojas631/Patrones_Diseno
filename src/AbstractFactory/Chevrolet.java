/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Leslie Rojas
 */
public class Chevrolet extends Carro{
    private double costoEnsamblaje;

    public Chevrolet(double costoEnsamblaje) {
        this.costoEnsamblaje = costoEnsamblaje;
    }

    public Chevrolet(double costoEnsamblaje, String modelo, String millas, double precio) {
        super(modelo, millas, precio);
        setCostoEnsamblaje(costoEnsamblaje);
        
    }

    public Chevrolet() {
        setDescripcion("Chevrolet");
    }

    public double getCostoEnsamblaje() {
        return costoEnsamblaje;
    }

    public void setCostoEnsamblaje(double costoEnsamblaje) {
        this.costoEnsamblaje = costoEnsamblaje;
    }
    
    
}
