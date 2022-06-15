/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Leslie Rojas
 */
public class Ventana implements IVentana
{
    public Ventana() {
    }
    // --------------------------------
    @Override
     public void dibujar(int col, int fila)
    {
        System.out.println("Dibujada ventana básica en [" + col + "], [" + fila + "]" );
    }
}