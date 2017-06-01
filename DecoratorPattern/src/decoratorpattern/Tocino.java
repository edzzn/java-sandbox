/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	31 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase concreta Tocino. 
 *              Tocino es un decorador de Combo
 * 
 * @param args
 * @author edzzn
 */


package decoratorpattern;

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

