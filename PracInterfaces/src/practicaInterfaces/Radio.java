/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Radio, hereda de Aparato
 *              implementa la interfas hablador
 *
 *
 * @param args
 * @author edzzn
 */
package practicaInterfaces;

public class Radio extends Aparato implements Hablador{
    private String casette;
    private int potencia;

    public Radio() {
    }

    public Radio(String casette, int potencia, int consumo, int precio) {
        super(consumo, precio);
        this.casette = casette;
        this.potencia = potencia;
    }

    // Se sobrescribre el metodo hablar
    @Override
    public void hablar() {
        System.out.println("Hola, soy un Radio y sé hablar");
        
        System.out.println("Hola, soy un Tv y sé hablar");
        System.out.println("casette: " + this.getCasette());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Consumo: " + super.getConsumo());
        System.out.println("potencia: " + this.getPotencia());
    }
    
    
    /**
     * @return the casette
     */
    public String getCasette() {
        return casette;
    }

    /**
     * @param casette the casette to set
     */
    public void setCasette(String casette) {
        this.casette = casette;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
