/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author Estudiante
 */
public class SuperCompleto implements Combo {

    @Override
    public void getValor() {
        System.out.println("Valor SuperCompleto: $$");;
    }

    @Override
    public void getDescripcion() {
        System.out.println("Combo SuperCompleto");
    }

}
