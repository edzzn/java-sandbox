/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Interfaz implementada por:  EuropeFinancialToolsFactory
 *                                      y   CanadaFinancialToolsFactory
 * 
 * 		
 * @param args
 * @author edzzn
 */

package abstractfactory;


public interface FinancialToolsFactory {
    ConvertirDolares createTaxProcessor();
}


