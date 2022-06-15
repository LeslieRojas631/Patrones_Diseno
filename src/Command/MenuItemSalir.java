/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author Leslie Rojas
 */
public class MenuItemSalir implements IMenuItem
{
     Receptor r;
    // --------------------------
    public MenuItemSalir( Receptor r ) {
        this.r = r;
    }
    // --------------------------
    @Override
     public void ejecutar() {
         r.accion("SALIR");
    }
}
