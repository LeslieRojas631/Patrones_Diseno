/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author Leslie Rojas
 */
public abstract class Colega
{
    protected IMediador mediador;
    public IMediador getMediador()
    {
        return this.mediador;
    }
  
    public void setMediador( IMediador m )
    {
        this.mediador = m;
    }
     public void comunicar(String mensaje)
    {
        this.getMediador().enviar(mensaje, this);
    }
    // -------------------------------
    // Método a implementar por las clases que hereden
     public abstract void recibir(String mensaje);
}

