/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Leslie Rojas
 */
public class DecoradorDesplazamientoHoriz extends DecoradorDesplazamiento
{
    public DecoradorDesplazamientoHoriz( IVentana v )
    {
         super( v );
    }
    // ---------------------------
    @Override
    public void dibujar(int col, int fila)
    {
        // Dibujar la ventana
        this.getVentana().dibujar(col, fila);
        // Agregar barra de desplazamiento
         this.dibujarBarraDespHorizontal();
    }
    // ---------------------------
     private void dibujarBarraDespHorizontal()
    {
        System.out.println("Agregada barra de desplazamiento horizontal");
    }
}