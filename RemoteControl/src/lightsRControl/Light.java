/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsRControl;

/**
 *
 * @author Estudiante
 */
public class Light {

    private boolean on;

    public void switchOn() {
        System.out.println("Prender");
        on = true;
    }

    public void switchOff() {
        System.out.println("Apagar");
        on = false;
    }

}
