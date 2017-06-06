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

    private String marca;
    private String modelo;
    private String color;
    private String placa;

    public Toyota(String color) {
        this.marca = "Toyota";
        this.modelo = "Yaris";
        this.color = color;
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Color: " + this.getColor());
        System.out.println("Placa: " + this.getPlaca());

    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
