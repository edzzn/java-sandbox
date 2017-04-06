/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Parte de EuropeToolsFactory, Implementa ShipFeeProcessor
 *              Calculo del Shipping especifico para Europe
 * 
 * 		
 * @param args
 * @author edzzn
 */

package abstractfactory;

public class EuropeShipFeeProcessor implements ShipFeeProcessor {

    @Override
    public void calculateShipFee(Order order) {
        // Ship Fee para Europe, cobra 1.3$ por cada Km
        order.setShipFee((int) (order.getDistancia() * 1.3));
    }

}
