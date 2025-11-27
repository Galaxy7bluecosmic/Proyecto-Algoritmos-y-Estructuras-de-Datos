MÓDULO 2 — Historial de Misiones (Pila)

Registrar misión completada → push

Consultar historial reciente → peek

Eliminar la última misión (rollback) → pop

Ver historial completo
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelos.PerfilDeJugador;
import Libreria.ImplementacionCola;
import Libreria.ImplementacionTADDoblementecircular;
/**
 *
 * @author victor
 */
public class Jugador {
    private int id;
    private String nickname;
    private ImplementacionCola Pilamisiones;
    private ImplementacionTADDoblementecircular LogrosObtenidos;
    
    public Jugador(int id,String nickname){
    this.id=id;
    this.nickname=nickname;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public ImplementacionCola getPilamisiones() {
        return Pilamisiones;
    }

    public ImplementacionTADDoblementecircular getLogrosObtenidos() {
        return LogrosObtenidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPilamisiones(ImplementacionCola Pilamisiones) {
        this.Pilamisiones = Pilamisiones;
    }

    public void setLogrosObtenidos(ImplementacionTADDoblementecircular LogrosObtenidos) {
        this.LogrosObtenidos = LogrosObtenidos;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nickname=" + nickname + ", Pilamisiones=" + Pilamisiones + ", LogrosObtenidos=" + LogrosObtenidos + '}';
    }
    
    
}
