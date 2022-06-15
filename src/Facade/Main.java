/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author Leslie Rojas
 */
public class Main
{
    public static void main(String[] args)
    {
        ComprobarLiquidos liquidos = new ComprobarLiquidos();
         liquidos.comprobar();
        ComprobarAsiento asiento = new ComprobarAsiento();
         asiento.comprobar();
        ComprobarEspejos espejos = new ComprobarEspejos();
         espejos.comprobar();
        Arrancar arrancar = new Arrancar();
         arrancar.encenderContacto();
        System.out.println("\nProceso finalizado.");
    }
}

