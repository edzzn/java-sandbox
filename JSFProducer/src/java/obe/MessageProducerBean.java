/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obe;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Queue;

/**
 *
 * @author edzzn
 */
@Named(value = "messageProducerBean")
@RequestScoped
public class MessageProducerBean {

    @Resource(mappedName = "jms/jsm/myQeue")
    private Queue jsmMyQeue;

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;
    private String message;
    /**
     * Creates a new instance of MessageProducerBean
     */
    public MessageProducerBean() {
    }

    public String getMessge() {
        return message;
    }

    public void setMessge(String messge) {
        this.message = messge;
    }
    
    public void send(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        sendJMSMessageToMyQueue(message);
        FacesMessage facesMessage = new FacesMessage("Message sent: " + message);
        facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
        facesContext.addMessage(null, facesMessage);
        
    }

    private void sendJMSMessageToMyQueue(String messageData) {
        context.createProducer().send(jsmMyQeue, messageData);
    }
    
}
