/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	31 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase concreta Queso. 
 *              Queso es un decorador de Combo
 * 
 * @param args
 * @author edzzn
 */


package decoratorpattern;


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
