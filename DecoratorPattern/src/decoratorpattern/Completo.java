/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	31 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase concreta Completo. 
 *              Es uno de los combos existentes.
 * 
 * @param args
 * @author edzzn
 */

package decoratorpattern;

public class Completo implements Combo{

    public void getValor() {
        System.out.println("Valor Completo: $$");;
    }

    @Override
    public void getDescripcion() {
        System.out.println("Combo Completo");
    }
    
    
}