/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edzzn
 */
public class MessageProducerBeanTest {
    
    public MessageProducerBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMessge method, of class MessageProducerBean.
     */
    @Test
    public void testGetMessge() {
        System.out.println("getMessge");
        MessageProducerBean instance = new MessageProducerBean();
        String expResult = "";
        String result = instance.getMessge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessge method, of class MessageProducerBean.
     */
    @Test
    public void testSetMessge() {
        System.out.println("setMessge");
        String messge = "";
        MessageProducerBean instance = new MessageProducerBean();
        instance.setMessge(messge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of send method, of class MessageProducerBean.
     */
    @Test
    public void testSend() {
        System.out.println("send");
        MessageProducerBean instance = new MessageProducerBean();
        instance.send();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
