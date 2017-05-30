/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: 
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba1;


public class ConversionProcessor {

    public static AbstractFactory getFactory() {

        return new ConversionFactory();
    }
}
