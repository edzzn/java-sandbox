/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Parte de CanadaToolsFactory, Implementa TaxProcessor
 *              Calculo del TAX especifico para Canada
 * 
 * 		
 * @param args
 * @author edzzn
 */
package abstractfactory;

public class CanadaTaxProcessor implements ConvertirDolares {

    @Override
    public void convertir(Moneda order) {
        // Tax en Canada = 0.18%
        order.setTax((int) (order.getValor() * 0.18));
    }

}
