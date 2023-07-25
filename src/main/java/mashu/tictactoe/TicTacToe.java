package mashu.tictactoe;

public class TicTacToe {

    public static void main(String[] args) {
       //Fichas
       Ficha FichaX= new Ficha("X");
       Ficha Ficha0= new Ficha();
       Ficha0.setFicha("O");
       
       //Jugadores
       Jugador JugadorX = new Jugador(FichaX);
       Jugador Jugador0 = new Jugador();
       Jugador0.setFicha(Ficha0);
      
       //Tablero
       Tablero Tablero = new Tablero();
       Tablero.Imprimir();
       
       boolean Ganar = false;
       
       for(int Veces = 1 ; Veces < 10 ; Veces++){
           if(Veces%2 == 0){
               Jugador0.placeFicha(Tablero);
               Ganar = Tablero.Ganador(Jugador0);
           }else{
               JugadorX.placeFicha(Tablero);
               Ganar = Tablero.Ganador(JugadorX);
           }
           Tablero.Imprimir();
           if(Ganar){
               break;
           }
       }
       if(Ganar){
           System.out.println("¡Eres Ganador!");
       }else{
           System.out.println("¡Intenta de nuevo!");
       }
    }
}
