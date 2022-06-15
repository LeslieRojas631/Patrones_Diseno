/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author Leslie Rojas
 */
public class ConstructorCocheBasico extends BuilderCoche
{
    public ConstructorCocheBasico() {
    }
    
    @Override
     public void construirMotor() {
        this.coche.setMotor( "Motor de potencia mínima" );
    }
    
    @Override
     public void construirCarroceria() {
        this.coche.setCarroceria( "Carrocería de baja protección" );
    }
    
    @Override
     public void construirAireAcond() {
        this.coche.setAireAcond( false );
    }
   
   
}
