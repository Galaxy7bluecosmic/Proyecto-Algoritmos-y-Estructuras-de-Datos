/**
 *
 * @author ttito
 */
public class NodoDobleCircular {
    Object dato;
    NodoDobleCircular siguiente;
    NodoDobleCircular anterior;

    public NodoDobleCircular(Object dato) {
        this.dato = dato;
        this.siguiente = this;
        this.anterior = this;
    }
}
