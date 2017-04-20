/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 19 Abril 2017
 * MODIFICACION:
 *
 * DESCRIPCION: Main
 *
 *
 *
 */
package factoryparametrizada;

/**
 *
 * @author edzzn
 */
public class FactoryParametrisada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DB dataBase = DBManager.createConnection("MySQL");
        dataBase.operation();
        dataBase = DBManager.createConnection("Oracle");
        dataBase.operation();
        dataBase = DBManager.createConnection("Generic");
        dataBase.operation();
               
    }
    
}
