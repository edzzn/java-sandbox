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


public class EuropeTaxProcessor implements ConvertirDolares {

    @Override
    public void convertir(Moneda moneda) {
        // Tax en Europa = 0.15%
        moneda.setTax((int) (moneda.getValor() * 0.15));

    }

}
