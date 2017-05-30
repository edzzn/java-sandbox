/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: DHPrivateManager. Manager de DHPrivateKey
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba2;


public class DHPrivateKeyManager extends KeyManager {

    @Override
    public Key factoryMethod() {
        return new DHPrivateKey(); 
    }


    
}
