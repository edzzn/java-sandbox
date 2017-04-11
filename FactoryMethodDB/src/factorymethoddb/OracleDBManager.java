/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 11 Abril 2017
 * MODIFICACION:
 *
 * DESCRIPCION: 
 *
 *
 *
 */
package factorymethoddb;

/**
 *
 * @author Estudiante
 */
public class OracleDBManager extends DBManager {
    public DB factoryMethod(){
        return new OracleDB();
    }
}
