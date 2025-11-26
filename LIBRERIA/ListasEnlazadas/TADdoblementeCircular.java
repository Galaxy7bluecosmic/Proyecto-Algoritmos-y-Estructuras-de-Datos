
package Libreria;

/**
 *
 * @author ttito 
 */
public interface TADLEDoblementeCircular <T> {
    
    void insertarInicio(T dato);
    void insertarFinal(T dato);
    void insertarEnPosicion(T dato, int posicion);

    void eliminarInicio();
    void eliminarFinal();
    Nodo<T> eliminarPosicion(int posicion);
    Nodo<T> eliminar(T dato);

    void mostrar();
    void mostrarAlReves();

    boolean buscar(T dato);
    int contarNodos();
  
}
