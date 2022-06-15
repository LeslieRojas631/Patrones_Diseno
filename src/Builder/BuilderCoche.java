/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author Leslie Rojas
 */
public abstract class BuilderCoche
{
     protected Coche coche;
    // ------------------------------
    public Coche getCoche() {
        return this.coche;
    }
    // ------------------------------
     public void crearNuevoCoche() {
        this.coche = new Coche();
    }
    // ------------------------------------
    // Métodos que deberán ser construídos por las clases que hereden de ésta
     public abstract void construirMotor();
     public abstract void construirCarroceria();
     public abstract void construirAireAcond();
}
