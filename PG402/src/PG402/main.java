package PG402;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Defensor j1 = new Defensor("J1", 2, 123);
        System.out.println("Val:"+ j1.calcularValoracion());
        j1.anotarGol();
        j1.darPase();
        j1.darPase();
        j1.darPase();
        j1.recuperarBalon();
        System.out.println("VAL" + j1.calcularValoracion());
    }
    
}
