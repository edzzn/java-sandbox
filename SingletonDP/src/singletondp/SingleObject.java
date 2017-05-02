/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Clase SingleObject
 *              Tiene provee un metodo estatico para 
 *              obtener su instancia.
 *
 *
 * @param args
 * @author edzzn
 */
package singletondp;

public class SingleObject {
    
    // Crea un objeto de SingleObject
    private static SingleObject instancia = new SingleObject();
    
    // Crea el contructor privado, NO puede ser instanciado
    private SingleObject(){}
    
    // Metodo get
    public static SingleObject getInstancia(){
        return instancia;
    }
    
    public void showMessage(){
        System.out.println("Hola Mundo!");
    }
    
}
