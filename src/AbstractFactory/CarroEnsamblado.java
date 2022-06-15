/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Leslie Rojas
 */
public class CarroEnsamblado {
    public CarroEnsamblado(CarroAbstractFactory fact){
        Pintura pintura=fact.crearPintura();
        Carro carro=fact.crearCarro();
        pintura.pintado(carro);
                
    }
}

