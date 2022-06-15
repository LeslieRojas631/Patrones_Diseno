/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Leslie Rojas
 */
public class DecoradorDesplazamientoVert extends DecoradorDesplazamiento
{
    public DecoradorDesplazamientoVert( IVentana v )
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
         this.dibujarBarraDespVertical();
    }
    // ---------------------------
     private void dibujarBarraDespVertical()
    {
        System.out.println("Agregada barra de desplazamiento vertical");
    }
}
