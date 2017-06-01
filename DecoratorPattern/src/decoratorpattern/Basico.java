/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	31 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase concreta Basico. 
 *              Es uno de los combos existentes.
 * 
 * @param args
 * @author edzzn
 */


package decoratorpattern;


public class Basico implements Combo {

    public void getValor() {
        System.out.println("Valor Basico: $$");;
    }

    @Override
    public void getDescripcion() {
        System.out.println("Combo Basico");
    }

}
