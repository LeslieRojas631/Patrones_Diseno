/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Leslie Rojas
 */
public class Nissan extends Carro{
    private double kilometraje;
    private double precioManufactura;


    public Nissan(double kilometraje, double precioManufactura, String modelo, String millas, double precio) {
        super(modelo, millas, precio);
        setKilometraje(kilometraje);
        setPrecioManufactura(precioManufactura);
    }

    public Nissan() {
        setDescripcion("Nissan");
    }

    

  

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getPrecioManufactura() {
        return precioManufactura;
    }

    public void setPrecioManufactura(double precioManufactura) {
        this.precioManufactura = precioManufactura;
    }

   
    
    
    
}
