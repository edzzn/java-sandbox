/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Moneda.
 *              Tiene los atributos de la moneda que va a ser convertida.
 *              Lleva tanto el valor como la información para decidir a que
 *              moneda convertir
 *              
 *
 *
 * @param args
 * @author edzzn
 */
package prueba1;


public class Moneda {
    private String converTo;
    private double valor;

    public Moneda(double valor) {
        this.valor = valor;
    }

    
    
    /**
     * @return the converTo
     */
    public String getConverTo() {
        return converTo;
    }

    /**
     * @param converTo the converTo to set
     */
    public void setConverTo(String converTo) {
        this.converTo = converTo;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
