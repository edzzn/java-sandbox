/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: DSAPrivateKeyManager. Manager de DSAPrivateKey
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba2;


public class DSAPrivateKeyManager extends KeyManager{

    @Override
    public Key factoryMethod() {
        return new DSAPrivateKey();
    }
    
}
