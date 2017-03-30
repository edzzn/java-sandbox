
/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	29 marzo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Alumno, hereda de persona.
 * 
 * 		
 * @param args
 * @author edzzn
 */

package practicaInterfaces;

public class Alumno extends Persona{
    private String carrera;
    private String curso;

    public Alumno() {
    }

    public Alumno(String carrera, String curso, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.curso = curso;
    }
    
    // Se sobrescribre el metodo hablar
    @Override
    public void hablar() {
        System.out.println("Hola, soy un Alumno y sé hablar");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Carrera: " + this.getCarrera());
        System.out.println("Curso: " + this.getCurso());
    }
    

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }  
    
}
