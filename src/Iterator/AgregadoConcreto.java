/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.Vector;

/**
 *
 * @author Leslie Rojas
 */
public class AgregadoConcreto implements Agregado
{
     protected Vector aDatos = new Vector();
    // -------------------------
    public AgregadoConcreto() {
        this.llenar();
    }
    // -------------------------
    @Override
     public Iterador getIterador()
    {
        return new IteradorConcreto( this );
    }
    // -------------------------
    public void llenar()
    {
        this.aDatos.add( new String("Maribel") );
        this.aDatos.add( new String("Juan") );
        this.aDatos.add( new String("Stephany") );
        this.aDatos.add( new String("Leslie") );
    }
}
