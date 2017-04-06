/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Familia de metodos que permite manejar los procesos financieros
 *              para Canada.
 *              Implementa FinancialToolsFactory
 * 
 * 		
 * @param args
 * @author edzzn
 */

package abstractfactory;

public class CanadaFinancialToolsFactory implements FinancialToolsFactory{
    
    @Override
    public ShipFeeProcessor createShipFeeProcessor() {
        return new CanadaShipFeeProcessor();
    }

    @Override
    public TaxProcessor createTaxProcessor() {
    return new CanadaTaxProcessor();
    }
    
}
