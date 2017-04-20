/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 19 Abril 2017
 * MODIFICACION:
 *
 * DESCRIPCION: Creatir and concrete creator
 *
 *
 *
 */
package factoryparametrizada;

public class DBManager {

    static DB createConnection(String decriptor) {
        {
            if ("Oracle".equals(decriptor)) {
                return new OracleDB();
            } else if ("MySQL".equals(decriptor)) {
                return new MySQLDB();
            } else {
                return new GenericDB();
            }

        }
    }

}