
package Servicios.GestionInteraccionesNpc;
import Modelos.NPC.NPC;
import Libreria.*;

/**
 *
 * @author victor
 */
public class GesNPC {
    ImplementacionTADDoblementecircular listaNPC;
    
    public GesNPC(){
        listaNPC= new ImplementacionTADDoblementecircular();
    }
    
    public void InsertarNPC(NPC npc){
    listaNPC.insertarFinal(npc);
    }
    public void EliminarNPC(int numero){
    listaNPC.eliminarPosicion(numero);
    }
    
    public void Mostrar(){
        listaNPC.mostrar();
    }
    
}
