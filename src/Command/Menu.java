/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

import java.util.ArrayList;

/**
 *
 * @author Leslie Rojas
 */
public class Menu
{
     private ArrayList<IMenuItem> aMenu = new ArrayList<IMenuItem>();
    // --------------------------
    public Menu() {
    }
    // --------------------------
    public void add( IMenuItem objMenuItem )
    {
        this.aMenu.add( objMenuItem );
    }
    // --------------------------
    public IMenuItem get( int nOpcion )
    {
        return this.aMenu.get( nOpcion );
    }
}