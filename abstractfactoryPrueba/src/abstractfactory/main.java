/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Aplicacion del patron de diseño ABSTRACT FACTORY
 *              - main()
 * 
 * 		
 * @param args
 * @author edzzn
 */

package abstractfactory;

public class main {

    public static void main(String[] args) {

        // Iniciamos con el constructor con los parametros: valor, Distancia, Codigo de Pais
        Moneda order = new Moneda(500, 120, "CA");
        OrderProcessor orderProcessor = null;
        FinancialToolsFactory factory = null;

        if (order.getCountryCode() == "EU") {
            factory = new EuropeFinancialToolsFactory();
        } else if (order.getCountryCode() == "CA") {
            factory = new CanadaFinancialToolsFactory();
        }

        orderProcessor = new OrderProcessor(factory);

        // Se procesa la orden, ShipFee y Tax se calculan
        orderProcessor.processOrder(order);

        //Muestra el Estado de Order
        order.showOrder();

    }

}
