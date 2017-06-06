/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	06-06-201
 * MODIFICACION:
 *
 * DESCRIPCION:Demo del Patron Flyweight.
 * FlyweightDemo actua como Client
 *
 *
 * @author Edisson Reinozo 
 */
package flyweightdemo;

public class FlyweightDemo {
    private static final String colores[] = {"Rojo", "Azul", "Negro", "Blanco"};
    
    public static void main(String[] args) {
        for(int i=0; i < 200; i++){
            Toyota toyota = (Toyota) VehiculoFactory.getToyota(getRandomColor());
            toyota.setPlaca(getRandomPlaca());
            toyota.mostrarVehiculo();
            System.out.println("---------- \n");
        }
    }

    public static String getRandomColor() {
        return colores[(int)(Math.random()*colores.length)];
    }

    public static String getRandomPlaca() {
        int n1 = (int)(Math.random()*9);
        int n2 = (int)(Math.random()*9);
        int n3 = (int)(Math.random()*9);
        String placaNumeros = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3);
        return "XXX-" + placaNumeros;
    }
}
