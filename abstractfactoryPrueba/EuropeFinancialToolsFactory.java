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
public class EuropeFinancialToolsFactory implements FinancialToolsFactory {
    public ShipFeeProcessor createShipFeeProcessor() {
        return new EuropeShipFeeProcessor();
    }

    @Override
    public TaxProcessor createTaxProcessor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
