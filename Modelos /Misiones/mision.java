package Modelos.Misiones;

/**
 *
 * @author victor
 */
public class Mision {
    private int id;
    private String nombre;
    private String descripcion;
    private String dificultad;
    private boolean completado;
    
    public Mision(int id, String nombre, String descripcion, String dificultad){
        this.nombre=nombre;
        this.id=id;
        this.descripcion=descripcion;
        this.dificultad=dificultad;
        this.completado=false;
    
    }
}
