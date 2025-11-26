/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

/**
 *
 * @author victor
 */
public class ImplementacionCola<T> implements TADCola<T> {
     Nodo cabeza=null;
    public boolean Vacia(){
    if (cabeza== null){
    return true;
    }return false;
    }
    
    @Override
     public void Enqueue(T dato){
          Nodo nuevo = new  Nodo(dato);
         
     if(this.Vacia()){
     cabeza = nuevo;
     return;
     }else{
     Nodo iterador = cabeza;
     
     while(iterador.siguiente !=null){
     iterador=iterador.siguiente;
     }
     iterador.siguiente = nuevo;
     }
     };
     
       @Override
    public void Dequeue (){
     if(this.Vacia()){
     return;
     }else{
     Nodo Temp = cabeza;
     cabeza= cabeza.siguiente;
     System.out.println(Temp.dato);
     }
    };
    
      @Override
    public void Peek(){
      if(this.Vacia()){
     return;
     }else{
     System.out.println(cabeza.dato);
     }
    };
    
}

