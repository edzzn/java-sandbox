/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usuario-1
 */
public class Random {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese nombre de archivo: ");
        String arch = sc.next();
        String path = arch + ".csv";

        String[] letras = {"a", "b", "c", "d", "e", "f", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String[] dias = {"01", "02", "03", "04", "05", "06", "07", "08", "09",
            "10", "11", "12", "13", "14", "15", "16", "17", "18",
            "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
            "29", "30", "31"};

        String[] meses = {"01", "02", "03", "04", "05", "06", "07", "08", "09",
            "10", "11", "12"};

        java.util.Random r = new java.util.Random();
        File archivo = new File(path);//ariginal=archivo

        CsvWriter csv = null;
        try {
            csv = new CsvWriter(new FileWriter(archivo), ',');
            int numeroRegistros = 10000;
            int k = 0;
            while (k < numeroRegistros) {
                k++;
                String palabra = "";
                for (int i = 0; i < 5; i++) {
                    palabra = palabra + (letras[r.nextInt(letras.length / 3)]);
                }
                csv.write(String.valueOf(r.nextInt(10000)));
                csv.write(palabra);
                csv.write(r.nextBoolean() ? "true" : "false");
                //int año=1950+w;
                csv.write(dias[r.nextInt(dias.length)].concat("/")
                        .concat(meses[r.nextInt(meses.length)]).concat("/")
                        .concat(String.valueOf((int) (Math.random() * 1920 + k + 1920))));
                csv.endRecord();
            }
        } catch (IOException ex) {
        }
        csv.close();
        System.out.println("Archivo tipo .csv\n" + path + "\nCreado!!!");

    }
}
