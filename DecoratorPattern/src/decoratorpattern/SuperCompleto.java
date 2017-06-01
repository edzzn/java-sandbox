/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	31 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase concreta SuperCompleto. 
 *              Es uno de los combos existentes.
 * 
 * @param args
 * @author edzzn
 */


package decoratorpattern;

public class SuperCompleto implements Combo {

    @Override
    public void getValor() {
        System.out.println("Valor SuperCompleto: $$");;
    }

    @Override
    public void getDescripcion() {
        System.out.println("Combo SuperCompleto");
    }

}
