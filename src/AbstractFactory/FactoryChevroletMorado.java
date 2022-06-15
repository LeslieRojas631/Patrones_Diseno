/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Leslie Rojas
 */
public class FactoryChevroletMorado extends CarroAbstractFactory {

    @Override
    public Carro crearCarro() {
    return new Chevrolet();
    }

    @Override
    public Pintura crearPintura() {
     return new Morado();   
    }
    
}
