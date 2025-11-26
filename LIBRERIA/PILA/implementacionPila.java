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

