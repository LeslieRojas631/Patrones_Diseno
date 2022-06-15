/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Leslie Rojas
 */
public class Main
{
    public static void main(String[] args)
    {
         Adaptador conversor = new Adaptador();
        conversor.ingresarDolares( 200 );
        conversor.ingresarDolares( 500 );
        conversor.ingresarDolares( 100 );
        System.out.println( "Total pesos mexicanos: " + conversor.getSaldo() );
    }
}