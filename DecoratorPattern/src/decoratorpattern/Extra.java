/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	31 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase abstracta Extra.
 *              implementacion del decorador.
 * 
 * @param args
 * @author edzzn
 */

package decoratorpattern;

public abstract class Extra implements Combo{
    protected Combo decoratedCombo;

    public Extra(Combo decoratedCombo) {
        this.decoratedCombo = decoratedCombo;
    }
 
    
    @Override
    public void getValor() {
        decoratedCombo.getValor(); 
    }
    
    public void getDescripcion(){
        decoratedCombo.getValor(); 
    }
    
}
