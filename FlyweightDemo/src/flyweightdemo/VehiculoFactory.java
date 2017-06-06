/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	06-06-2017
 * MODIFICACION:
 *
 * DESCRIPCION: Vehiculo Factory.
 *              Crea y maneja objetos Flyweight. Se asegura que los objetos Flyweight son compartidos de manera adecuada.
 *              Devuelve una instancia existente o crea una si no existe.
 * @author Edisson Reinozo 
 */
package flyweightdemo;

import java.util.HashMap;

public class VehiculoFactory {
    private static final HashMap<String, Vehiculo> toyotaMap = new HashMap();
    
    public static Vehiculo getToyota(String color){
        Toyota toyota = (Toyota) toyotaMap.get(color);
        
        if (toyota == null){
            toyota = new Toyota(color);
            toyotaMap.put(color, toyota);
            System.out.println("Creando un nuevo color de Toyota");
        }
        return toyota;
    }
    
}
