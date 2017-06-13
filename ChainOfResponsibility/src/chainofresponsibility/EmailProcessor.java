/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

public class EmailProcessor {

    //maintain a reference to the previous handler so we can add the next one
    private EmailHandler prevHandler;

    public void addHandler(EmailHandler handler) {
        if (prevHandler != null) {
            prevHandler.setNext(handler);
        }

        prevHandler = handler;
    }
    
    public void handleRequest(Email email){
        System.out.println("email @ EmailProcessor");
    }
}
