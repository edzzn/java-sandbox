/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 19 Abril 2017
 * MODIFICACION:
 *
 * DESCRIPCION: Concrete Product
 *
 *
 *
 */
package factoryparametrizada;

/**
 *
 * @author edzzn
 */
public class MySQLDB implements DB {

    MySQLDB() {
    }
    
    @Override
    public void operation(){
        System.out.println("Soy MySQL");
    }

}
