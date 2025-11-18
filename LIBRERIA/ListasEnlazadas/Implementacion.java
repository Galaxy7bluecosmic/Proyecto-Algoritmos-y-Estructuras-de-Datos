/**
 *
 * @author ttito
 */
public class ListaCircularDoble implements TADListaCircularDoble {
    private NodoDobleCircular head;
    public ListaCircularDoble(){
        head = null;
    }
    public boolean estaVacia(){
        return head == null;
    }
    public void insertarFinal(Object dato) {
    NodoDobleCircular nuevo = new NodoDobleCircular(dato);

    if (estaVacia()) {
        head = nuevo;
        return;
    }

    NodoDobleCircular tail = head.anterior;

    tail.siguiente = nuevo;
    nuevo.anterior = tail;

    nuevo.siguiente = head;
    head.anterior = nuevo;
}
public void insertarInicio(Object dato) {
    insertarFinal(dato);
    head = head.anterior; 
}
public void mostrar() {
    if (estaVacia()) {
        System.out.println("Lista vacía");
        return;
    }

    NodoDobleCircular temp = head;
    do {
        System.out.print(temp.dato + " <-> ");
        temp = temp.siguiente;
    } while (temp != head);
    System.out.println("(inicio)");
}
public void mostrarAlReves() {
    if (estaVacia()) {
        System.out.println("Lista vacía");
        return;
    }

    NodoDobleCircular tail = head.anterior;
    NodoDobleCircular temp = tail;

    do {
        System.out.print(temp.dato + " <-> ");
        temp = temp.anterior;
    } while (temp != tail);
    System.out.println("(final)");
}
public boolean buscar(Object dato) {
    if (estaVacia()) return false;

    NodoDobleCircular temp = head;
    do {
        if (temp.dato == dato) return true;
        temp = temp.siguiente;
    } while (temp != head);

    return false;
}
public int contarNodos() {
    if (estaVacia()) return 0;

    int contador = 0;
    NodoDobleCircular temp = head;

    do {
        contador++;
        temp = temp.siguiente;
    } while (temp != head);

    return contador;
}
public void insertarEnPosicion(Object dato, int pos) {
    if (pos <= 1) {
        insertarInicio(dato);
        return;
    }

    int n = contarNodos();
    if (pos > n) {
        insertarFinal(dato);
        return;
    }

    NodoDobleCircular nuevo = new NodoDobleCircular(dato);
    NodoDobleCircular temp = head;

    for (int i = 1; i < pos - 1; i++) {
        temp = temp.siguiente;
    }

    nuevo.siguiente = temp.siguiente;
    nuevo.anterior = temp;

    temp.siguiente.anterior = nuevo;
    temp.siguiente = nuevo;
}
public void eliminarInicio() {
    if (estaVacia()) return;

    eliminar(head.dato);
}
public void eliminarFinal() {
    if (estaVacia()) return;

    NodoDobleCircular tail = head.anterior;
    eliminar(tail.dato);
}
public void eliminarPosicion(int pos) {
    if (estaVacia()) return;

    int n = contarNodos();
    if (pos < 1 || pos > n) return;

    if (pos == 1) {
        eliminarInicio();
        return;
    }

    if (pos == n) {
        eliminarFinal();
        return;
    }

    NodoDobleCircular temp = head;
    for (int i = 1; i < pos; i++) {
        temp = temp.siguiente;
    }

    temp.anterior.siguiente = temp.siguiente;
    temp.siguiente.anterior = temp.anterior;
}
public void eliminar(Object dato) {
    if (estaVacia()) return;

    NodoDobleCircular actual = head;

    do {
        if (actual.dato == dato) {

            if (actual.siguiente == actual) {
                head = null;
                return;
            }

            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;

            if (actual == head) {
                head = actual.siguiente;
            }

            return;
        }

        actual = actual.siguiente;

    } while (actual != head);
}

    
}
