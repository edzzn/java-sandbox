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
public class Tocino extends Extra {

    public Tocino(Combo decoratedCombo) {
        super(decoratedCombo);
    }


    @Override
    public void getValor() {
        decoratedCombo.getValor();
        setTocinoValor(decoratedCombo);
    }

    @Override
    public void getDescripcion() {
        decoratedCombo.getValor();
        setTocinoDescripcion(decoratedCombo);
    }

    private void setTocinoValor(Combo decoratedCombo) {
        System.out.println("+ Tocino: $");
    }
    
    private void setTocinoDescripcion(Combo decoratedCombo) {
        System.out.println("+ Tocino");
    }
}

