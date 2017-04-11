/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Implementacion de un ejemplo de
 *              El patron BUILDER
 *
 *
 * @param args
 * @author edzzn
 */
package builderpizza;

public class BuilderPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cocina cocina = new Cocina();
      ConstructorPizza hawai_constructorpizza = new ConstructorPizzaHawaiana();
      ConstructorPizza margarita_constructorpizza = new ConstructorPizzaMargarita();

      cocina.setConstructorPizza(hawai_constructorpizza);
      cocina.contruirPizza();

      Pizza pizza = cocina.getPizza();
      
      System.out.println(pizza.getMasa());

    }

}
