package Modelos.Logros;

/**
 *
 * @author victor
 */
public class Logro {
    private int id;
    private String nombre;
    private String descripcion;
    private String calidad;
    
    public Logro (int id, String nombre, String descripcion, String calidad){
    this.id=id;
    this.nombre=nombre;
    this.descripcion=descripcion;
    this.calidad=calidad;
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

    public String getCalidad() {
        return calidad;
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

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
    
    
}
