/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author Leslie Rojas
 */
public class Main
{
    public static void main(String[] args)
    {
        // Crear el objeto Director
         Director objFabrica = new Director();
        // Crear los objetos ConcreteBuilder
         BuilderCoche base  = new ConstructorCocheBasico();
         BuilderCoche medio = new ConstructorCocheMedio();
         BuilderCoche full  = new ConstructorCocheLleno();
        // Construir un coche con equipamiento base
         objFabrica.construir( base );
         Coche cocheBase = base.getCoche();
        // Construir un coche con equipamiento medio
        objFabrica.construir( medio );
        Coche cocheMedio = medio.getCoche();
        // Construir un coche con equipamiento full
        objFabrica.construir( full );
        Coche cocheFull = full.getCoche();
        // Mostrar la información de cada coche creado
        mostrarCaracteristicas( cocheBase );
        mostrarCaracteristicas( cocheMedio );
        mostrarCaracteristicas( cocheFull );
    }
    public static void mostrarCaracteristicas( Coche coche )
    {
        System.out.println( "Motor: " + coche.getMotor() );
        System.out.println( "Carrocería: " + coche.getCarroceria() );
        System.out.println( "Airea acondicionado: " + coche.getAireAcond() );
        System.out.println("===================================");
    }
}