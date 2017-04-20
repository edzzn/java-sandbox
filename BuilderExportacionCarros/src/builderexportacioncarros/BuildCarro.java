/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderexportacioncarros;

/**
 *
 * @author Estudiante
 */
abstract class BuildCarro {
    protected Carro carro;
    
    public void createNewCarro(){
        setCarro(new Carro());
    }
    
    public abstract void setNombre();

    /**
     * @return the carro
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
}
