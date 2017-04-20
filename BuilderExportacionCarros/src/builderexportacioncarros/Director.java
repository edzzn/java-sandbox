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
public class Director {
    protected BuildCarro buildCarro;
    
    public void construirCarro(){
        getBuildCarro().setNombre();
    }
    
    public Carro getCarro(){
        return getBuildCarro().getCarro();
    }

    /**
     * @return the buildCarro
     */
    public BuildCarro getBuildCarro() {
        return buildCarro;
    }

    /**
     * @param buildCarro the buildCarro to set
     */
    public void setBuildCarro(BuildCarro buildCarro) {
        this.buildCarro = buildCarro;
    }
}
