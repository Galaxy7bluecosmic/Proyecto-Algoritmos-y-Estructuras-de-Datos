
package Libreria;
import Modelos.Misiones.Mision;
import Modelos.Logros.Logro;
/**
 *
 * @author ttito
 */
public class ImplementacionTADDoblementecircular <T> implements TADLEDoblementeCircular<T>{
   
    private Nodo<T> head = null;
   

    

    public boolean estaVacia() {
        return head == null;
    }

    @Override
    public void insertarFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (estaVacia()) {
        head = nuevo;
         head.siguiente = head;
        head.anterior = head;
        return;
  }
      Nodo<T> tail = head.anterior;
     tail.siguiente = nuevo;
     nuevo.anterior = tail;
     nuevo.siguiente = head;
     head.anterior = nuevo;
  }

    @Override
    public void insertarInicio(T dato) {
        insertarFinal(dato);
        head = head.anterior;
    }
    @Override
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo<T> temp = head;
        do {
        System.out.print(temp.dato + " <-> ");
        temp = temp.siguiente;
        } while (temp != head);
        System.out.println("(inicio)");
    }
    
    @Override
    public void mostrarAlReves() {
        if (estaVacia()) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo<T> tail = head.anterior;
        Nodo<T> temp = tail;

        do {
            System.out.print(temp.dato + " <-> ");
            temp = temp.anterior;
        } while (temp != tail);
        System.out.println("(final)");
    }

    @Override
    public boolean buscar(T dato) {
        if (estaVacia()) return false;

        Nodo<T> temp = head;
        do {
        if (temp.dato.equals(dato))
            return true;
        
          temp = temp.siguiente;
        } while (temp != head);
        return false;
    }

    @Override
    public int contarNodos() {
        if (estaVacia()) return 0;
        int contador = 0;
        Nodo<T> temp = head;
        do {
         contador++;
         temp = temp.siguiente;
        } while (temp != head);
        return contador;
    }
    @Override
    public void insertarEnPosicion(T dato, int pos) {
        if (pos <= 1) {
            insertarInicio(dato);
            return;
        }

        int n = contarNodos();
        if (pos > n) {
            insertarFinal(dato);
            return;
        }
        Nodo<T> nuevo = new Nodo<>(dato);
        Nodo<T> temp = head;
        
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.siguiente;
        }
       nuevo.siguiente = temp.siguiente;
       nuevo.anterior = temp;
       temp.siguiente.anterior = nuevo;
       temp.siguiente = nuevo;
    }

    @Override
    public void eliminarInicio() {
        if (estaVacia()) return;
        eliminar(head.dato);
    }
    
    @Override
    public void eliminarFinal() {
        if (estaVacia()) return;
        Nodo<T> tail = head.anterior;
        eliminar(tail.dato);
    }

    @Override
    public Nodo<T> eliminarPosicion(int pos) {
        Nodo<T> temp = head;
        Nodo<T> temp2 = head.anterior;
        if (estaVacia()) 
            return null;

        int n = contarNodos();
        if (pos < 1 || pos > n)
            return null;

        if (pos == 1) {
            this.eliminarInicio();
            return temp;
        }

        if (pos == n) {
            this.eliminarFinal();
            return temp2;
        }

        for (int i = 1; i < pos; i++) {
            temp = temp.siguiente;
        }
        if (temp == head) {
        head = temp.siguiente;
        }
        
        temp.anterior.siguiente = temp.siguiente;
        temp.siguiente.anterior = temp.anterior;
        return temp;
    }

    @Override
    public Nodo<T> eliminar(T dato) {
        if (estaVacia()) return null;

        Nodo<T> actual = head;

        do {
            if (actual.dato.equals(dato)) {
                if (actual.siguiente == actual) {
                    head = null;
                    return actual;
                }

                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;

                if (actual == head) {
                    head = actual.siguiente;
                }

                return actual;
            }
            actual = actual.siguiente;
        } while (actual != head);

        return null;
    }
}

