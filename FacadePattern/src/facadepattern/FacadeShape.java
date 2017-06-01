/*
 *  Fachada, Conoce que calses del subsistema son responsables de la
 *  peticion. Se encarga de delegar estas peticiones.
 */
package facadepattern;

/**
 *
 * @author Estudiante
 */
public class FacadeShape {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public FacadeShape() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }
    
    public void drawCircle(){
        this.circle.draw();
    }
    public void drawSquare(){
        this.square.draw();
    }
    public void drawRectangle(){
        this.rectangle.draw();
    }

    
    
}
