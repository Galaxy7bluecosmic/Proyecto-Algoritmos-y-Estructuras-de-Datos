/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

/**
 *
 * @author victor
 */
public class ImplementacionArbolBinario implements TADArbolBinario{
    
    Nodo raiz = null;
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
     private int alturaRec(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(alturaRec(nodo.hojaIzquierda), alturaRec(nodo.hojaDerecha));
    }

     @Override
      public void insertar(int numero){
      raiz = InsetarRec(raiz,numero);
      };
      
      private Nodo InsetarRec(Nodo nodo, int numero){
      if(nodo == null){
      Nodo nuevo = new Nodo(numero);
      return nuevo;
      }
      if(numero>nodo.numero){
      nodo.hojaDerecha = InsetarRec(nodo.hojaDerecha,numero);
      }else{
      nodo.hojaIzquierda = InsetarRec(nodo.hojaIzquierda,numero);
      }
      return nodo;
      }
      
      @Override
       public int obtenerRaiz(){
       if (raiz == null) {return -1;};
        return raiz.numero;
       };
       
       @Override
      public int obtenerIzquierdo(Nodo nodo){
      if (nodo == null || nodo.hojaIzquierda == null) {return -1;}
        return nodo.hojaIzquierda.numero;
      };
      
       @Override
      public int obtenerDerecho(Nodo nodo){
      if (nodo == null || nodo.hojaDerecha == null) {return -1;}
        return nodo.hojaDerecha.numero;
      };
      
       @Override
      public void eliminar(int numero){
      if (this.esVacio()){
      System.out.println("arbol sin raiz");
      return;}else{
      raiz = eliminarRec(raiz,numero);
      }
          
      };
      private int minimo(Nodo nodo) {
    while (nodo.hojaIzquierda != null) {
      nodo=nodo.hojaIzquierda;
     
    }
    return nodo.numero;
}

      private Nodo eliminarRec(Nodo nodo, int numero){
      if (nodo == null){
        return null;
    }
    if (numero < nodo.numero){
     nodo.hojaIzquierda = eliminarRec(nodo.hojaIzquierda, numero);
    } else if (numero > nodo.numero){
       nodo.hojaDerecha = eliminarRec(nodo.hojaDerecha, numero);
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
        int sucesor = minimo(nodo.hojaDerecha);
        nodo.numero = sucesor; 
        nodo.hojaDerecha = eliminarRec(nodo.hojaDerecha, sucesor);
    }return nodo;  
    }
       @Override
      public void preOrden(){
      preOrdenRec(raiz);
        System.out.println();
      };
       private void preOrdenRec(Nodo nodo) {
        if (nodo == null){return;}
        System.out.print(nodo.numero + " ");
        preOrdenRec(nodo.hojaIzquierda);
        preOrdenRec(nodo.hojaDerecha);
    }
       @Override
      public void inOrden(){
        inOrdenRec(raiz);
        System.out.println();
      };
      private void inOrdenRec(Nodo nodo) {
        if (nodo == null){return;}
        inOrdenRec(nodo.hojaIzquierda);
        System.out.print(nodo.numero + " ");
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
        System.out.print(nodo.numero + " ");
    }
        
       @Override
      public int nivelOrden(int numero){
          return nivelNodoRec(raiz,numero,0);
      };
      private int nivelNodoRec(Nodo nodo, int numero, int nivel) {
        if(nodo == null) {
            return -1;
        }
        if(nodo.numero == numero) {
            return nivel;
        }
        if(numero < nodo.numero) {
            return nivelNodoRec(nodo.hojaIzquierda, numero, nivel + 1);
        } else {
            return nivelNodoRec(nodo.hojaDerecha, numero, nivel + 1);
    }
    }

       @Override
      public boolean buscar(int numero){
      return buscarNodo(raiz, numero);};

      private boolean buscarNodo(Nodo nodo, int numero) {
        if(nodo == null){
            return false;
        }
        if(nodo.numero == numero){
            return true;
        }
        if(numero < nodo.numero){
            return buscarNodo(nodo.hojaIzquierda, numero);
        }else{
            return buscarNodo(nodo.hojaDerecha, numero);
    }
    }
     
}

