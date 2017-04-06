/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	6 Abril 2017
 * MODIFICACION:
 * DESCRIPCION: Clase order, Lleva toda la informacion de la Orden, 
 * 
 * 		
 * @param args
 * @author edzzn
 */
package abstractfactory;


public class Order {
    private int valor;
    private int distancia;
    private int tax;
    private int shipFee;
    private String countryCode;

    public Order(int valor, int distancia, String countryCode) {
        this.valor = valor;
        this.distancia = distancia;
        this.countryCode = countryCode;
        this.tax = 0;
        this.shipFee = 0;
    }

    
    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }
    
    // Muestra el estado de Order
    public void showOrder(){
        System.out.println("Order");
        System.out.println("CountryCode: " + this.countryCode);
        System.out.println("Value: $" + this.getValor());
        System.out.println("ShipDistance: " + this.getDistancia() + " Km");
        System.out.println("TAX: $" + this.getTax());
        System.out.println("ShipFEE: $" + this.getShipFee());
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the distancia
     */
    public int getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the tax
     */
    public int getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(int tax) {
        this.tax = tax;
    }

    /**
     * @return the shipFee
     */
    public int getShipFee() {
        return shipFee;
    }

    /**
     * @param shipFee the shipFee to set
     */
    public void setShipFee(int shipFee) {
        this.shipFee = shipFee;
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
   
}
