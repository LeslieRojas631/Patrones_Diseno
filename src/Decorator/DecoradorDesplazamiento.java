/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Leslie Rojas
 */
public abstract class DecoradorDesplazamiento implements IVentana
{
     protected IVentana v;
 
     public DecoradorDesplazamiento( IVentana v )
    {
         this.setVentana( v );
    }
  
    public IVentana getVentana()
    {
        return this.v;
    }
    
    public void setVentana( IVentana v )
    {
        this.v = v;
    }
  
    @Override
     public void dibujar(int col, int fila)
    {
         this.getVentana().dibujar(col, fila);
    }
}