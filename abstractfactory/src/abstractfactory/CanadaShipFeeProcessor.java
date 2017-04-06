/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Parte de CanadaToolsFactory, Implementa ShipFeeProcessor
 *              Calculo del Shipping especifico para Canada
 * 
 * 		
 * @param args
 * @author edzzn
 */
package abstractfactory;


public class CanadaShipFeeProcessor implements ShipFeeProcessor {

    @Override
    public void calculateShipFee(Order order) {
        // ShipFee en Canada es $1.1 por cada Km
        order.setShipFee((int) (order.getDistancia() * 1.1));
    }

}
