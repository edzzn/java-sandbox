/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	06-06-2017
 * MODIFICACION:
 *
 * DESCRIPCION: Toyota Factory.
 *              Implementa la interfaz Flyweight y almacena los estados intrínsecos.  
 *              Debe ser compartible.
 * @author Edisson Reinozo 
 */
package flyweightdemo;


public class Toyota implements Vehiculo {

    private String marca = "Toyota";
    private String modelo = "Yaris";
    private String color;
    private String placa;

    public Toyota(String color) {
        this.marca = "Toyota";
        this.modelo = "Yaris";
        this.color = color;
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.getColor());
        System.out.println("Placa: " + this.getPlaca());

    }


    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
