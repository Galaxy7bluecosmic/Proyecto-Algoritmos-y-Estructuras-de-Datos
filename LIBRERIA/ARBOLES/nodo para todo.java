package Libreria;

public class Nodo {
     Object dato;
   Nodo siguiente;
   Nodo anterior;
   int numero;

   Nodo hojaDerecha;
   Nodo hojaIzquierda;
  
   public Nodo(Object dato){
   this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
           
   }
   
   public Nodo(int numero){
       this.numero=numero;
      this.hojaDerecha=null;
        this.hojaIzquierda=null;  
   }
}
