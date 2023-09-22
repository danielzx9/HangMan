
package modelo;

import java.util.ArrayList;
import vista.Game;


public class Ahorcado {
    private int aciertos;
    private int oportunidades;
    private String mensaje;
    public char letra;
    Game game =new Game();

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    public ArrayList equipos= new ArrayList(){{add("Aston Huila"); add("Barcelona");}};

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
        
       
    
    
}
