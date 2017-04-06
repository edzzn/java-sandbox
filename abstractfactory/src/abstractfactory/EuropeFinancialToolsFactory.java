/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Familia de metodos que permite manejar los procesos financieros
 *              para Europa
 *              Implementa FinancialToolsFactory
 * 
 * 		
 * @param args
 * @author edzzn
 */
package abstractfactory;

public class EuropeFinancialToolsFactory implements FinancialToolsFactory {
    @Override
    public ShipFeeProcessor createShipFeeProcessor() {
        return new EuropeShipFeeProcessor();
    }

    @Override
    public  TaxProcessor createTaxProcessor() {
        return new EuropeTaxProcessor();
    }

  

}
