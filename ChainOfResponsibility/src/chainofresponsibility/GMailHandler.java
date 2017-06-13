/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

public class GMailHandler implements EmailHandler {

    private EmailHandler next;

    @Override
    public void setNext(EmailHandler handler) {
        next = handler;
    }

    @Override
    public void handleRequest(Email email) {
        if (!email.getFrom().endsWith("@gmail.com")) {
            next.handleRequest(email);
        } else {    //handle request (move to correct folder)}}}
        }
    }
}
