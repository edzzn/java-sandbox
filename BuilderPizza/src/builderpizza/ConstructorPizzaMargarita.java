/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: ContreteBuilder:
 *              Construye y ensambla las partes del producto.
 *              Proporciona una interfaz para obtener el producto que se crea
 *
 * @param args
 * @author edzzn
 */
package builderpizza;

public class ConstructorPizzaMargarita extends ConstructorPizza{

    @Override
    public void buildMasa() {
        pizza.setMasa("cocida");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("picante");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("pimienta+salchicón");
    }

}
