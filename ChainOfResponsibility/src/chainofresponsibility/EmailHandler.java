/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

//Handler
public interface EmailHandler{
    //reference to the next handler in the chainpublic 
    void setNext(EmailHandler handler);
    //handle requestpublic 
    void handleRequest(Email email);
}
