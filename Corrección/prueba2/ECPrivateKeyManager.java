/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: ECPrivateKeyManager. Manager de ECPrivateKey
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba2;


public class ECPrivateKeyManager extends KeyManager{

    @Override
    public Key factoryMethod() {
        return new ECPrivateKey();
    }
    
}
