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
public class Client {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        // encender
        control.setCommand(lightsOn);
        control.pressButton();
        
        // Apagar
        control.setCommand(lightsOff);
        control.pressButton();
        
    }

}
