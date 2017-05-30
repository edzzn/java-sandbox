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


public class ConversionToEuros implements Conversion{

    @Override
    public void convertirDolares(double dolares) {
        System.out.println(toEuros(dolares));
    }
    
    public double toEuros (double dolares){
        return dolares*1.14;
    }

}
