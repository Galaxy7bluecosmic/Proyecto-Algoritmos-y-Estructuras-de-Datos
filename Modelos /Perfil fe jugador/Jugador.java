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
    
    
}
