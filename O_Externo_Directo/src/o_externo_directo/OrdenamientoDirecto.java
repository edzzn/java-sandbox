package o_externo_directo;


import com.csvreader.CsvReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


/**
 *
 * @author Usuario-1
 */
public class OrdenamientoDirecto {

    public void Procesar(int campo, File archivo) throws IOException, FileNotFoundException, ParseException {
        int rango = 0;
        //  rango: numRegistros
        try {
            CsvReader leer = new CsvReader(archivo.getAbsolutePath());
            while (leer.readRecord()) {
                rango++;
            }
            leer.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        System.out.print("\n Numero de Registros: " + rango + "\nCampo Selecionado : ");
    
        File file1 = new File(archivo.getParent() + "\\" + "F1.csv");
        File file2 = new File(archivo.getParent() + "\\" + "F2.csv");

        MezclaDirecta mezcla = new MezclaDirecta(archivo, file1, file2, rango, campo);
    }

}
