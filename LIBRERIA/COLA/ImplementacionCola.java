/**
 *
 * @author victor
 */
public class ImplementacionCola implements TADcola{
    NODO cabeza=null;
    public boolean Vacia(){
    if (cabeza== null){
    return true;
    }return false;
    }
    
    @Override
     public void Enqueue(Object dato){
         NODO nuevo = new NODO(dato);
         
     if(this.Vacia()){
     cabeza = nuevo;
     return;
     }else{
     NODO iterador = cabeza;
     
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
     NODO Temp = cabeza;
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
