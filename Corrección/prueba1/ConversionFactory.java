/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Factory Concreta, Factory para Conversion.
 *              Decide que clase debe encargarse de la conversion
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba1;


public class ConversionFactory extends AbstractFactory {

    @Override
    Conversion getConversion(String tipoMoneda) {
        if (tipoMoneda == null) {
            return null;
        }

        if (tipoMoneda.equalsIgnoreCase("EU")) {
            return new ConversionToEuros();

        } else if (tipoMoneda.equalsIgnoreCase("GBP")) {
            return new ConversionToGBP();
        }

    }

}
