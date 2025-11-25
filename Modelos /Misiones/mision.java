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

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
    
}
