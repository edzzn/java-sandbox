package o_externo_directo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Usuario-1
 */
public class O_Externo_Directo {

    public static Scanner sc = new Scanner(System.in);

    public static Scanner txt = new Scanner(System.in);

    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        
//falta abrir el archivo y eligir el campo
//String dato=""+arc.getPath();
        System.out.println("----------------------------Campos a ordenar------------------------------");

        System.out.println("0)Numerico\n1)Texto\n2)Booleano\n3)Fecha");
        System.out.print("Seleccionar Campo a ordenar : ");
        //-----------------tiempo de ejecucion de un algoritmo
        //System.currentMillis();
        //long inicioTienPC = System.currentTimeMillis();
        int campo = sc.nextInt();
        //  C:\Users\Usuario-1\Desktop\O_Externo_Directo
        //aqui ubicar la direcion de la carpeta que contien al .csv
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ingrese carpeta de ubicacion de archivo: \nEjemplo C:\\Users\\Usuario-1\\Desktop\\O_Externo_Directo\\archivo.csv");
        String direccion = txt.nextLine();
        long inicioTienPC = System.currentTimeMillis();
        File archivo = new File(direccion);

        //File archivo = new File("C:\\Users\\Usuario-1\\Desktop\\O_Externo_Directo\\" + arc.getPath());
        long inicioTienAl = System.currentTimeMillis();
        OrdenamientoDirecto ordenar = new OrdenamientoDirecto();
        switch (campo) {
            case 0:
                System.out.print("Numerico");

                ordenar.Procesar(campo, archivo);
                break;
            case 1:
                System.out.print("Texto");

                ordenar.Procesar(campo, archivo);
                break;

            case 2:
                System.out.print("Booleano");

                ordenar.Procesar(campo, archivo);
                break;

            case 3:
                System.out.print("Fecha");

                ordenar.Procesar(campo, archivo);
                break;
        }
        long finTiepPC = System.currentTimeMillis();
        long finEjeAl = System.currentTimeMillis();
        long tiempoPC = (finTiepPC - inicioTienPC) / 1000;
        long tiempoEjecucionAlg = (finEjeAl - inicioTienAl) / 1000;
        System.out.println("----------Timepo de ejecucion algoritmo----------");
        System.out.println("Tiempo de ejecucion milisegundos: " + (finEjeAl - inicioTienAl));
        System.out.println("Tiempo de ejecucion segundos: " + tiempoEjecucionAlg);
        System.out.println("----------Timepo de ejecucion PC----------");
        System.out.println("Tiempo de ejecucion milisegundos: " + (finTiepPC - inicioTienPC));
        System.out.println("Tiempo de ejecucion segundos: " + tiempoPC);

    }

}
