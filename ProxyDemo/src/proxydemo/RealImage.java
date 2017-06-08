/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxydemo;

/**
 *
 * @author Estudiante
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Mostrnado " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Cargando " + fileName);
    }

}
