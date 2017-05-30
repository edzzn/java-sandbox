/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Maneja el procesamiento de las ordenes, 
 *              Envia objects factory a procesos de calculo de Tax y ShipFee
 * 
 * 		
 * @param args
 * @author edzzn
 */
package abstractfactory;

public class OrderProcessor {
    public ConvertirDolares taxProcessor;

    public OrderProcessor(FinancialToolsFactory factory) {
        this.taxProcessor = factory.createTaxProcessor();
    }
    
    public void processOrder(Moneda order){
        
        taxProcessor.convertir(order);
        
    }
    
    
}
