/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: PBEKeyManager. Manager de PBEKey
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba2;


public class PBEKeyManager extends KeyManager{

    @Override
    public Key factoryMethod() {
        return new PBEKey();
    }

}
