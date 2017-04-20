/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryparametrizada;

/**
 *
 * @author edzzn
 */
public class GenericDB implements DB{

    @Override
    public void operation() {
        System.out.println("Soy Generic");   
    }
}
