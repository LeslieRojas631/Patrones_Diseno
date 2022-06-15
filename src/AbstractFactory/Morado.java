/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Leslie Rojas
 */
public class Morado extends Pintura{
private boolean secundario;
    @Override
    public void pintado(Carro carro) {
        System.out.println("Pintando de morado..."+carro.getDescripcion());
        
    }

    public boolean isSecundario() {
        return secundario;
    }

    public void setSecundario(boolean secundario) {
        this.secundario = secundario;
    }
        
}
