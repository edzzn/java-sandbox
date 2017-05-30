/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Clase order, Lleva toda la informacion de la Orden.
 *  
 * 		
 * @param args
 * @author edzzn
 */
package abstractfactory;


public class Moneda {
    private double valor;

    public Moneda(int valor, int distancia, String countryCode) {
        this.valor = valor;
    }

    
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }
    
    // Muestra el estado de Order
    public void showOrder(){
        System.out.println("Value: $" + this.getValor());

    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.setValor(valor);
    }
    
    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
   
}
