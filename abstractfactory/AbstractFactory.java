/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Estudiante
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String countryCode = "EU";
        //Customer customer = new Customer();
        Order order = new Order();
        OrderProcessor orderProcessor = null;
        FinancialToolsFactory factory = null;
        
        if (countryCode == "EU"){
            factory = new EuropeFinancialToolsFactory();
        } else if (countryCode == "CA"){
            factory = new CanadaFinancialToolsFactory();
        }
        
        orderProcessor = new OrderProcessor(factory);
        orderProcessor.processOrder(order);
        
    }
    
}
