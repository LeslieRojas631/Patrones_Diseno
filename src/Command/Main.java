/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author Leslie Rojas
 */
public class Main
{
    public static void main(String[] args)
    {
        // Crear el objeto Menú (el Invocador)
        Menu objMenu = new Menu();
        // Crear el Receptor
        Receptor objReceptor = new Receptor();
        // Crear las opciones de menú, indicándoles el Receptor
        IMenuItem objOpcionAbrir = new MenuItemAbrir( objReceptor );
        IMenuItem objOpcionImprimir = new MenuItemImprimir( objReceptor );
        IMenuItem objOpcionSalir = new MenuItemSalir( objReceptor );
        // Agregar las opciones al Menú
        objMenu.add( objOpcionAbrir );
        objMenu.add( objOpcionImprimir );
        objMenu.add( objOpcionSalir );
        // Ejecutar cada opción del menú
        objMenu.get(0).ejecutar();
        objMenu.get(1).ejecutar();
        objMenu.get(2).ejecutar();
    }
}

