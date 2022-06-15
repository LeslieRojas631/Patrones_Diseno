/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author Leslie Rojas
 */
public class Receptor
{
    public Receptor() {
    }
    // -----------------------
     public void accion( String accion )
    {
        if( accion.compareTo("ABRIR") == 0 ) {
            System.out.println("Abrir documento");
        } else if( accion.compareTo("IMPRIMIR") == 0 ) {
            System.out.println("Imprimir documento");
        } else if( accion.compareTo("SALIR") == 0 ) {
            System.out.println("Salir del programa");
        } else {
            System.out.println("Opción no válida");
        }
    }
}