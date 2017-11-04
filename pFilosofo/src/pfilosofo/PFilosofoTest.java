/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfilosofo;

/**
 *
 * @author edzzn
 */
public class PFilosofoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Silla s = new Silla();
        
        
        Tenedor[] tenedores = new Tenedor[6];
        for (int i=0; i<6; i++){
            tenedores[i] = new Tenedor(i);                   
        }

        Filosofo[] filosofos = new Filosofo[5];
        for (int i=0; i<5; i++){
            filosofos[i] = new Filosofo(i, tenedores[i], tenedores[(i+1)%5], s);
        }
        
        for (int i=0; i<filosofos.length; i++){
            filosofos[i].start();
            System.out.println("Filósofo " +i+ " empezo a pensar");
        }
    }
    
}
