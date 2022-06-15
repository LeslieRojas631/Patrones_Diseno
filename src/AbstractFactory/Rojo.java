/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Leslie Rojas
 */
public class Rojo extends Pintura{
    private boolean primario;

    @Override
    public void pintado(Carro carro) {
        System.out.println("Pintando de rojo..."+carro.getDescripcion());
    }

    public boolean isPrimario() {
        return primario;
    }

    public void setPrimario(boolean primario) {
        this.primario = primario;
    }
    
}
