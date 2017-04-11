/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 11 Abril 2017
 * MODIFICACION:
 *
 * DESCRIPCION: ConcreteCreator
 *              Constructor del product MYQUL
 *
 *
 *
 */
package factorymethoddb;

/**
 *
 * @author Estudiante
 */
public class MySQLDBManager extends DBManager{

    /**
     *
     * @return
     */
    @Override
    public DB factoryMethod(){
        return new MySQLDB();
    }
}
