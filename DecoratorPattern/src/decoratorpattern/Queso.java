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
public class Queso extends Extra {

    public Queso(Combo decoratedCombo) {
        super(decoratedCombo);
    }

    @Override
    public void getValor() {
        decoratedCombo.getValor();
        setQuesoValor(decoratedCombo);
    }

    @Override
    public void getDescripcion() {
        decoratedCombo.getValor();
        setQuesoDescripcion(decoratedCombo);
    }

    private void setQuesoValor(Combo decoratedCombo) {
        System.out.println("+ Queso: $");
    }
    
    private void setQuesoDescripcion(Combo decoratedCombo) {
        System.out.println("+ Queso");
    }
}
