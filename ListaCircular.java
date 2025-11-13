/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pf_ectructuradedatos;

/**
 *
 * @author ttito
 */
public class ListaCircular {
    Nodo head;
    public ListaCircular(){
        head = null;
    }
     public void insertar(int dato){
         Nodo nuevo = new Nodo(dato);
         
         if(head == null) {
             head = nuevo;
             nuevo.siguiente = head;
         }else{
             Nodo temp = head;
             while (temp.siguiente !=head){
                 temp = temp.siguiente;
                 
             }
             temp.siguiente = nuevo;
             nuevo.siguiente = head;
         }
     }
     public void mostrar(){
         if (head == null) {
             System.out.println("Lista vacía");
             return;
         }
         Nodo temp = head;
         do{
             System.out.print(temp.dato + " ");
         }while(temp !=head);
         
         System.out.println();
         }
     }


