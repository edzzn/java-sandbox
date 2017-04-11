/**
 * AUTOR: 	Edisson Reinozo
 * CREACION: 11 Abril 2017
 * MODIFICACION:
 *
 * DESCRIPCION: Implementacion del patron de diseño: FactoryMehods
 *
 *
 *
 */
package factorymethoddb;

/**
 *
 * @author Estudiante
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBManager manager = new MySQLDBManager();
        MySQLDB mysql = (MySQLDB) manager.factoryMethod();
        
        mysql.operation();
        
        manager = new OracleDBManager();
        
        OracleDB oracle = (OracleDB) manager.factoryMethod();
        
        oracle.operation();

    }
    
}
