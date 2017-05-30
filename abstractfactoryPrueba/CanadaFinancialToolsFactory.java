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
public class CanadaFinancialToolsFactory implements FinancialToolsFactory{
    
    public ShipFeeProcessor createShipFeeProcessor() {
        return new CanadaShipFeeProcessor();
    }

    @Override
    public TaxProcessor createTaxProcessor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
