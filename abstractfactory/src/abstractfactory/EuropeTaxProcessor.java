/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Parte de EuropeToolsFactory, Implementa ShipFeeProcessor
 *              Calculo del TAX especifico para Europe
 * 
 * 		
 * @param args
 * @author edzzn
 */
package abstractfactory;


public class EuropeTaxProcessor implements TaxProcessor {

    @Override
    public void calculateTaxes(Order order) {
        // Tax en Europa = 0.15%
        order.setTax((int) (order.getValor() * 0.15));

    }

}
