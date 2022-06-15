/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author Leslie Rojas
 */
public class ConstructorCocheLleno extends BuilderCoche
{
    public ConstructorCocheLleno() {
    }
    
    @Override
     public void construirMotor() {
        this.coche.setMotor( "Motor de potencia alta" );
    }
   
    @Override
     public void construirCarroceria() {
        this.coche.setCarroceria( "Carrocería de alta protección" );
    }
    
    @Override
     public void construirAireAcond() {
        this.coche.setAireAcond( true );
    }
  
}