/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Corrección del examen interciclo Analisis y Dis de Software
 *              Segunda Pregunta.
 *              Implementación Factory Method
 *
 *
 * @param args
 * @author edzzn
 */
package prueba2;


public class Main {

    public static void main(String[] args) {
        
        // Ejemplo de creación de la pirmera llave.
        KeyManager dph_manager = new DHPrivateKeyManager();
        DHPrivateKey dhp_key = (DHPrivateKey) dph_manager.factoryMethod();
        
        dhp_key.getKey();

    }
    
}
