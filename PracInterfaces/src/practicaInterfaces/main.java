/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Practica del uso de interfaces
 *
 *
 * @param args
 * @author edzzn
 */
package practicaInterfaces;

import java.util.ArrayList;
import java.util.List;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creamos un vector de tipo hablador
        Alumno a1 = new Alumno("Ingerieria", "4th", "Jose", 20);
        // a1.hablar();
        Object[] arr = new Object[7];

        // http://stackoverflow.com/questions/18274110/array-of-objects-of-different-types
        // Array of objects of different types - interfaces
        
        List<Hablador> hablantes = new ArrayList<>();
        hablantes.add(new Loro("Europa", "Rojo", "Macho", 2));
        hablantes.add(new Piolin(5, "En la ducha", "Macho", 6));
        hablantes.add(new Alumno("Economía", "5th", "Carlos", 20));
        hablantes.add(new Profesor("555-D", "jesus@Ucuenca.ec", "Jesus", 55));
        hablantes.add(new Bedel("Tarde", 10, "Dani", 40));
        hablantes.add(new Tv("Si", 5, 500, 250));
        hablantes.add(new Radio("Si", 5, 500, 250));

        for (Hablador hablante : hablantes) {
            hablante.hablar();
            System.out.println("----------");
        }
    }

}
