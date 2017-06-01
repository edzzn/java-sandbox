/*
 * Extra es nuestro ComboDecorator
 */
package decoratorpattern;

/**
 *
 * @author Estudiante
 */
public abstract class Extra implements Combo{
    protected Combo decoratedCombo;

    public Extra(Combo decoratedCombo) {
        this.decoratedCombo = decoratedCombo;
    }
 
    
    @Override
    public void getValor() {
        decoratedCombo.getValor(); 
    }
    
    public void getDescription(){
        decoratedCombo.getValor(); 
    }
    
}
