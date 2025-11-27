MÓDULO 2 — Historial de Misiones (Pila)

Registrar misión completada → push

Consultar historial reciente → peek

Eliminar la última misión (rollback) → pop

Ver historial completo
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios.GestionLogros;
import Modelos.Misiones.Mision;
import Libreria.*;
/**
 *
 * @author victor
 */
public class GesMisiones {
   TADPila registro = new ImplementacionPila();
    Mision mision1 = new Mision(1,"primer paso","hablar con un npc",1);
    
    public void RegistrarMisiones(Mision mision1){
    registro.Push(mision1);
    System.out.println("Mision agredada");
    }
    public void MisionCumplida(){
    registro.Pop();
    System.out.println("Felicidades");
    }
    public void VerMisionActual(){
    registro.Peek();
    }
    public void BorrarActual(){
    registro.Pop();
    System.out.println("Mision borrada");
    }
    public void Vermisiones(){
    registro.Ver();
    }
}
