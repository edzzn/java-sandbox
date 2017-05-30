/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Abstracta Factory.
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba1;


public abstract class AbstractFactory {
    abstract Conversion getConversion(String tipoMoneda);
}
