/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

import java.util.ArrayList;

/**
 *
 * @author Leslie Rojas
 */
public class Mediador implements IMediador
{
    private ArrayList<Colega> colegas;
    // -------------------------------
    public Mediador()
    {
        this.colegas = new ArrayList<Colega>();
    }
    // -------------------------------
     public void agregarColega(Colega colega)
    {
        this.colegas.add( colega );
    }
    // ------------------------------
    @Override
     public void enviar(String mensaje, Colega originator)
    {
        for( Colega colega : colegas )
        {
            if( colega != originator )
            {
                colega.recibir( mensaje );
            }
        }
    }
}
