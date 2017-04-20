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
public class OracleDB implements DB {

    OracleDB() {
    }
  
    @Override
    public void operation(){
        System.out.println("Soy OracleDB");
    }

}