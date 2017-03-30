/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Loro, hereda de Ave
 *              implementa la interfas hablador
 *
 *
 * @param args
 * @author edzzn
 */
package practicaInterfaces;

public class Loro extends Ave implements Hablador {

    private String region;
    private String Color;

    public Loro() {
    }

    public Loro(String region, String Color, String sexo, int edad) {
        super(sexo, edad);
        this.region = region;
        this.Color = Color;
    }

    // Se sobrescribre el metodo hablar
    @Override
    public void hablar() {
        System.out.println("Hola, soy un Loro y sé hablar");
        System.out.println("Edad: "+ super.getEdad());
        System.out.println("Sexo: "+ super.getSexo());
        System.out.println("Region: "+ this.getRegion());
        System.out.println("Color: "+ this.getColor());
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

}
