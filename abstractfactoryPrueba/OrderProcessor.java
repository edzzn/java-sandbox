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
public class OrderProcessor {
    public TaxProcessor taxProcessor;
    public ShipFeeProcessor shipFeeProcessor;

    public OrderProcessor(FinancialToolsFactory factory) {
        this.taxProcessor = factory.createTaxProcessor();
        this.shipFeeProcessor = factory.createShipFeeProcessor();
    }
    
    public void processOrder(Order order){
        
        taxProcessor.calculateTaxes(order);
        shipFeeProcessor.calculateShipFee(order);
        
    }
    
    
}
