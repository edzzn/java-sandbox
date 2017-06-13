/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

//email client 
public class EmailClient {

    private EmailProcessor processor;

    public EmailClient() {
        createProcessor();
    }

    private void createProcessor() {
        processor = new EmailProcessor();
        processor.addHandler(new BusinessMailHandler());
        processor.addHandler(new GMailHandler());
    }

    public void addRule(EmailHandler handler) {
        processor.addHandler(handler);
    }

    public void emailReceived(Email email) {
        processor.handleRequest(email);
    }

    public static void main(String[] args) {
        EmailClient client = new EmailClient();
        Email email = new Email("a@e.com", "ed@gmail.com", "texto del correo");
        client.emailReceived(email);
        
    }
}
