/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Clase abastracta para crear los componentes
 *              abstractBuilder
 *              
 *              
 * 		
 * @param args
 * @author edzzn
 */
package builderpizza;

// PizzaBuider Abstract
abstract class ConstructorPizza {
    protected Pizza pizza;

    public  void crearNuevaPizza(){
        pizza = new Pizza();
    }
            
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
    
    
    
    /**
     * @return the pizza
     */
    public Pizza getPizza() {
        return pizza;
    }

    /**
     * @param pizza the pizza to set
     */
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    
    
    
}
