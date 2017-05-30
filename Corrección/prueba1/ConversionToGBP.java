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


public class ConversionToGBP implements Conversion {
    
    @Override
    public void convertirDolares(double dolares) {
        System.out.println(toGBP(dolares));
    }
    public double toGBP (double dolares){
        return dolares*1.5;
    }
}
