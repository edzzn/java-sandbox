package facadepattern;

/**
 *
 * @author Estudiante
 */
public class FacadePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FacadeShape facadeShape = new FacadeShape();

        facadeShape.drawCircle();
        facadeShape.drawRectangle();
        facadeShape.drawSquare();

    }

}
