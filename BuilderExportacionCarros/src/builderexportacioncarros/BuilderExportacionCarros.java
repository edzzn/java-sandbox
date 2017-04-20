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
public class BuilderExportacionCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director director = new Director();
        BuildCarro lujo_buildCarro = new BuildCarroLujo();
        
        director.setBuildCarro(lujo_buildCarro);
        director.construirCarro();
        
    }
    
}
