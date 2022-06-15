/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author Leslie Rojas
 */
public class ConstructorCocheMedio extends BuilderCoche
{
    public ConstructorCocheMedio() {
    }
    
    @Override
     public void construirMotor() {
        this.coche.setMotor( "Motor de potencia media" );
    }
    
    @Override
     public void construirCarroceria() {
        this.coche.setCarroceria( "Carrocería de protección media" );
    }
    
    @Override
     public void construirAireAcond() {
        this.coche.setAireAcond( false );
    }
}