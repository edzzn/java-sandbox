/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosconsumidores;

/**
 *
 * @author edzzn
 */
public class Consumer extends Thread {
    protected Buffer b;
    private int id;

    public Consumer(Buffer b, int id) {
        this.b = b;
        this.id = id;
    }

    public void run() {
        Object value;

        while (true) {
            System.out.println("Consumer #" + id + ": [ get ...");
            value = b.get();
            System.out.println("Consumer #" + id + ": " + value + " ]");
            consume(value);
        }
    }

    private void consume(Object value) {
        try {
            sleep((int)(Math.random() * 100));
        } catch (InterruptedException e){
        }
    }
}