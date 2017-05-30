/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: RSAPrivateKeyManager. Manager de RSAPrivateKey
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba2;


public class RSAPrivateKeyManager extends KeyManager {

    @Override
    public Key factoryMethod() {
        return new RSAPrivateKey();
    }
    
}
