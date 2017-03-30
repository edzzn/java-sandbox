/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Tv, hereda de Aparato
 *              implementa la interfas hablador
 *
 *
 * @param args
 * @author edzzn
 */
package practicaInterfaces;

public class Tv extends Aparato implements Hablador {

    private String teletexto;
    private int antiguiedad;

    public Tv() {
    }

    public Tv(String teletexto, int antiguiedad, int consumo, int precio) {
        super(consumo, precio);
        this.teletexto = teletexto;
        this.antiguiedad = antiguiedad;
    }

    // Se sobrescribre el metodo hablar
    @Override
    public void hablar() {
        System.out.println("Hola, soy un Tv y sé hablar");
        System.out.println("Teletexto: " + this.getTeletexto());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Consumo: " + super.getConsumo());
        System.out.println("Antiguedad: " + this.getAntiguiedad());
    }

    /**
     * @return the teletexto
     */
    public String getTeletexto() {
        return teletexto;
    }

    /**
     * @param teletexto the teletexto to set
     */
    public void setTeletexto(String teletexto) {
        this.teletexto = teletexto;
    }

    /**
     * @return the antiguiedad
     */
    public int getAntiguiedad() {
        return antiguiedad;
    }

    /**
     * @param antiguiedad the antiguiedad to set
     */
    public void setAntiguiedad(int antiguiedad) {
        this.antiguiedad = antiguiedad;
    }

}
