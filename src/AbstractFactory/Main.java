/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Leslie Rojas
 */
public class Main {
    public static void main(String[] args) {
        CarroAbstractFactory c1= new FactoryChevroletMorado();
        CarroEnsamblado ce1= new CarroEnsamblado(c1);
        CarroAbstractFactory c2= new FactoryNissanRojo();
        CarroEnsamblado ce2= new CarroEnsamblado(c2);
    }
}
