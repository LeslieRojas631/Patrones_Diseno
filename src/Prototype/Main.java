/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author Leslie Rojas
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CelularPrototype cp = new CelularPrototype();
        Celular c1=(Celular) cp.prototipo("Samsung");
        System.out.println(c1.getMarca()+" "+c1.getPeso()+" "+c1.getTamaño());
        
        System.out.println();
         Celular c2=(Celular) cp.prototipo("iPhone");
         System.out.println(c2.getMarca()+" "+ c2.getTamaño()+ " "+ c2.getPeso());
    }
}
