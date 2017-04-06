/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Metodo Conica
 *              Construye el objeto utilizando la inferfaz Builder
 *              
 * 		
 * @param args
 * @author edzzn
 */
package builderpizza;

public class Cocina {
    private ConstructorPizza constructorPizza;
    
    public void contruirPizza(){
        constructorPizza.crearNuevaPizza();
        constructorPizza.buildMasa();
        constructorPizza.buildRelleno();
        constructorPizza.buildSalsa();
    }
    
    
    
    /**
     * @return the constructorPizza
     */
    public ConstructorPizza getConstructorPizza() {
        return constructorPizza;
    }

    /**
     * @param constructorPizza the constructorPizza to set
     */
    public void setConstructorPizza(ConstructorPizza constructorPizza) {
        this.constructorPizza = constructorPizza;
    }
    
}
