/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Corrección del examen interciclo Analisis y Dis de Software
 *              primera Pregunta.
 *              Implementa Abstract Factory
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba1;


public class Main {
    
    public static void main(String[] args) {
        AbstractFactory factory = ConversionProcessor.getFactory();
        Moneda moneda = new Moneda(50);
        moneda.setConverTo("EU");
        
        Conversion c1 = factory.getConversion(moneda.getConverTo());
        c1.convertirDolares(moneda.getValor());
        
        moneda.setConverTo("GBP");
        Conversion c2 = factory.getConversion(moneda.getConverTo());
        c2.convertirDolares(moneda.getValor());
    }
    
}
