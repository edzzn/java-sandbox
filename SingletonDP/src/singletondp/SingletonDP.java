/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	2 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Implementacion del Patron de diseño Singleton
 *              Siguiendo el tutorial:
 *              https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 *              
 *              Se obtiene el objeto de SingleObject
 *
 * @param args
 * @author edzzn
 */
package singletondp;

public class SingletonDP {

    public static void main(String[] args) {
        // Obtencion del UNICO objeto disponible
        SingleObject objeto = SingleObject.getInstancia();
        // Mostrar mensaje
        objeto.showMessage();
    }
    
}
