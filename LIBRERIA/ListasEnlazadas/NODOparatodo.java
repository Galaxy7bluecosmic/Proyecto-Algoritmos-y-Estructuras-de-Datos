
package Libreria;
//aut@r todos
public class Nodo <T> {
 
  
   Nodo<T> hojaDerecha;
   Nodo<T> hojaIzquierda;
  
    Nodo<T> siguiente;
    Nodo<T> anterior;
    T dato;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
    
    
}
