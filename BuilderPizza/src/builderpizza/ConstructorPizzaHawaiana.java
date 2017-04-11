/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Constructor de Pizza Hawaiana -  ContreteBuilder
 *               Proporciona una interfaz para obtener el producto que se crea
 *
 * @param args
 * @author edzzn
 */

package builderpizza;

public class ConstructorPizzaHawaiana extends ConstructorPizza{

    @Override
    public void buildMasa() {
        pizza.setMasa("suave");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("dulce");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("chorizo+alcachofsa");
    }
    
}
