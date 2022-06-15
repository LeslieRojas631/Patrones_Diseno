/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

import java.util.HashMap;

/**
 *
 * @author Leslie Rojas
 */
public class CelularPrototype {
    private HashMap<String,Celular> prototipos=new HashMap<String,Celular>();

    public CelularPrototype() {
        Samsung samsung = new Samsung(600, "Galaxy S10", "6 plg", "15 gr", 500);
        iPhone iphone = new iPhone("128", 600, "XR", "6 plg", "16 gr", 600);
        prototipos.put("Samsung", samsung);
        prototipos.put("iPhone", iphone);
    }
    public Object prototipo(String tipo ) throws CloneNotSupportedException{
        return prototipos.get(tipo).clone();
    }
}
