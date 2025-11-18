
/**
 *
 * @author ttito
 */
public interface TADListaCircularDoble {

    void insertarInicio(Object dato);
    void insertarFinal(Object dato);
    void insertarEnPosicion(Object dato, int posicion);

    void eliminarInicio();
    void eliminarFinal();
    void eliminarPosicion(int posicion);
    void eliminar(Object dato);

    void mostrar();
    void mostrarAlReves();

    boolean buscar(Object dato);
    int contarNodos();
}
