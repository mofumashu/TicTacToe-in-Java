package mashu.tictactoe;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jugador {
    private Ficha Ficha;
    
    public Jugador(){       
    }
    
    public Jugador(Ficha Ficha){
        this.Ficha = Ficha;
    }
    
    public Ficha getFicha(){
        return Ficha;
    }
    
    public void setFicha(Ficha Ficha){
        this.Ficha = Ficha;
    }
    
    public void placeFicha(Tablero Tablero){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            System.out.print("Fila: ");
            int Fila = Integer.parseInt(br.readLine());
            System.out.print("Columna: ");
            int Columna = Integer.parseInt(br.readLine());
            Tablero.getTablero()[Fila][Columna] = " _"+this.Ficha.getFicha()+"_ ";
        } catch (IOException ex){
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
