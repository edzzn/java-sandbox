package decoratorpattern;

/**
 * Patron decorator: Añade funcionalidad adicional dinamicamente a un objecto.
 * Forma flexible de extender funcionalidad
 *
 * Tambien se lo concoce como WAPPER
 *
 * @author Estudiante
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Combo completo = new Completo();

        Combo basicoTocino = new Tocino(new Basico());

        System.out.println("Completo");
        completo.getDescripcion();
        completo.getValor();

        System.out.println("");

        System.out.println("Básico más tocino");
        basicoTocino.getDescripcion();
        basicoTocino.getValor();

    }

}
