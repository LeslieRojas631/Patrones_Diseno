/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author Leslie Rojas
 */
public class Coche {

    private String motor = "";
    private String carroceria = "";
    private Boolean aireAcond = false;

    public Coche() {
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCarroceria() {
        return this.carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public Boolean getAireAcond() {
        return aireAcond;
    }

    public void setAireAcond(Boolean aireAcond) {
        this.aireAcond = aireAcond;
    }
}
