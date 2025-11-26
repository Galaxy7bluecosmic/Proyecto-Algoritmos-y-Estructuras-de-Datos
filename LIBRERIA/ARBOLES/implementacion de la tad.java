/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

/**
 *
 * @author Enock & el resto
 */
interface identificador{
    int getId();
    void setId(int dato);
}
public class ImplementacionArbolBinario<T extends identificador> implements TADArbolBinario<T>{
    
    Nodo<T> raiz = null;
    private boolean esVacio(){
        if(raiz==null){return true;}
        return false;
    }
    
     
    @Override
    public void vaciar(){
    raiz = null;
    }
    
    @Override
     public int altura(){
     return alturaRec(raiz);
     };
     private int alturaRec(Nodo<T> nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(alturaRec(nodo.hojaIzquierda), alturaRec(nodo.hojaDerecha));
    }

     @Override
      public void insertar(T dato){
      raiz = InsetarRec(raiz,dato);
      };
      
      private Nodo InsetarRec(Nodo<T> nodo, T dato){
      if(nodo == null){
      Nodo nuevo = new Nodo<>(dato);
      return nuevo;
      }
      if(dato.getId()>nodo.dato.getId()){
      nodo.hojaDerecha = InsetarRec(nodo.hojaDerecha,dato);
      }else{
      nodo.hojaIzquierda = InsetarRec(nodo.hojaIzquierda,dato);
      }
      return nodo;
      }
      
      @Override
       public int obtenerRaiz(){
       if (raiz == null) {return -1;};
        return raiz.dato.getId();
       };
       
       @Override
      public int obtenerIzquierdo(Nodo<T> nodo){
      if (nodo == null || nodo.hojaIzquierda == null) {return -1;}
        return nodo.hojaIzquierda.dato.getId();
      };
      
       @Override
      public int obtenerDerecho(Nodo<T> nodo){
      if (nodo == null || nodo.hojaDerecha == null) {return -1;}
        return nodo.hojaDerecha.dato.getId();
      };
      
       @Override
      public void eliminar(T dato){
      if (this.esVacio()){
      System.out.println("arbol sin raiz");
      return;}else{
      raiz = eliminarRec(raiz,dato);
      }
          
      };
      private T minimo(Nodo<T> nodo) {
    while (nodo.hojaIzquierda != null) {
      nodo=nodo.hojaIzquierda;
     
    }
    return nodo.dato;
}

      private Nodo eliminarRec(Nodo<T> nodo, T dato){
      if (nodo == null){
        return null;
    }
    if (nodo.dato.getId()> dato.getId()){
     nodo.hojaIzquierda = eliminarRec(nodo.hojaIzquierda, dato);
    } else if (nodo.dato.getId() < dato.getId()){
       nodo.hojaDerecha = eliminarRec(nodo.hojaDerecha, dato);
    } 
    else{
        if (nodo.hojaIzquierda == null && nodo.hojaDerecha == null) {
            return null;
        }
        if (nodo.hojaIzquierda == null){
            return nodo.hojaDerecha;
        }
        if (nodo.hojaDerecha == null){
            return nodo.hojaIzquierda;
        }
        T sucesor = minimo(nodo.hojaDerecha);
         nodo.dato = sucesor;
         nodo.hojaDerecha = eliminarRec(nodo.hojaDerecha, sucesor);
    }return nodo;  
    }
      
      
       @Override
      public void preOrden(){
      preOrdenRec(raiz);
        System.out.println();
      };
       private void preOrdenRec(Nodo<T> nodo) {
        if (nodo == null){return;}
        System.out.print(nodo.dato.toString() + " ");
        preOrdenRec(nodo.hojaIzquierda);
        preOrdenRec(nodo.hojaDerecha);
    }
       
       @Override
      public void inOrden(){
        inOrdenRec(raiz);
        System.out.println();
      };
      private void inOrdenRec(Nodo<T> nodo) {
        if (nodo == null){return;}
        inOrdenRec(nodo.hojaIzquierda);
        System.out.print(nodo.dato.toString() + " ");
        inOrdenRec(nodo.hojaDerecha);
    }
      
       @Override
      public void postOrden(){
        postOrdenRec(raiz);
        System.out.println();
      };
        private void postOrdenRec(Nodo nodo) {
        if (nodo == null){return;}
        postOrdenRec(nodo.hojaIzquierda);
        postOrdenRec(nodo.hojaDerecha);
        System.out.print(nodo.dato.toString() + " ");
    }
        
       @Override
      public int nivelOrden(T dato){
          return nivelNodoRec(raiz, dato,0);
      };
      private int nivelNodoRec(Nodo<T> nodo, T dato, int nivel) {
        if(nodo == null) {
            return -1;
        }
        if(nodo.dato.getId() == dato.getId()) {
            return nivel;
        }
        if(dato.getId() < nodo.dato.getId()) {
            return nivelNodoRec(nodo.hojaIzquierda, dato, nivel + 1);
        } else {
            return nivelNodoRec(nodo.hojaDerecha, dato, nivel + 1);
    }
    }

       @Override
      public boolean buscar(T dato){
      return buscarNodo(raiz, dato);};

      private boolean buscarNodo(Nodo<T> nodo, T dato) {
        if(nodo == null){
            return false;
        }
        if(nodo.dato.getId() == dato.getId()){
            return true;
        }
        if(dato.getId() < nodo.dato.getId()){
            return buscarNodo(nodo.hojaIzquierda, dato);
        }else{
            return buscarNodo(nodo.hojaDerecha, dato);
    }
    }
     
}
