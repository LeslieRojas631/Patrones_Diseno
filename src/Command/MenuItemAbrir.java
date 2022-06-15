/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author Leslie Rojas
 */
public class MenuItemAbrir implements IMenuItem
{
     Receptor r;
    // --------------------------
    public MenuItemAbrir( Receptor r ) {
        this.r = r;
    }
    // --------------------------
    @Override
     public void ejecutar() {
         r.accion("ABRIR");
    }
}