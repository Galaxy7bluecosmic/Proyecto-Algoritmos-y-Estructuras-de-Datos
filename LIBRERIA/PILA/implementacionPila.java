/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

/**
 *
 * @author victor
 */
public class ImplementacionPila <T> implements TADPila<T>{
      Nodo <T> cabeza=null;
    public boolean Vacia(){
    if (cabeza== null){
    return true;
    }return false;
    }
    
    @Override
     public void Push (T dato){
         Nodo nuevo = new Nodo(dato);
         
     if(this.Vacia()){
     cabeza = nuevo;
     return;
     }else{
     nuevo.siguiente=cabeza;
     cabeza=nuevo;
     }
     };
     
       @Override
    public void Pop (){
     if(this.Vacia()){
     return;
     }else{
     Nodo Temp = cabeza;
     cabeza= cabeza.siguiente;
     System.out.println(Temp.dato.toString());
     }
    };
    
      @Override
    public void Peek(){
      if(this.Vacia()){
     return;
     }else{
     System.out.println(cabeza.dato.toString());
     }
    };
}
