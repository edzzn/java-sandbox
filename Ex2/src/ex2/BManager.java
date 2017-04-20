/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Estudiante
 */
public class BManager {
    
    static B createB(String id){
        if("B1".equals(id)){
            return new B1();
        } else if("B2".equals(id)){
            return new B2();
        } else{
            return new BGeneric();
        }
    }
}
