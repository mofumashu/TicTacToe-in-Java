package mashu.tictactoe;

public class Tablero {
    private String[][] Tablero;
    
    public Tablero(){
        Tablero = new String[3][3]; 
        Clear();
    }
    
    public Tablero(String[][] Tablero){
        this.Tablero=Tablero;
    }
    
    public String[][] getTablero(){
        return Tablero;
    }
    
    public void setTablero(String[][] Tablero){
        this.Tablero=Tablero;
    }
    
    //Funcion Limpiar Tablero
    public void Clear(){
        for(int i = 0 ; i < Tablero.length ; i++){
            for(int j = 0 ; j < Tablero[0].length ; j++){
                Tablero[i][j]=" ___ ";
            } 
        }
    }
    
    //Funcion Imprimir Tablero
    public void Imprimir(){
        for(int i = 0 ; i < Tablero.length ; i++){
            for(int j = 0 ; j < Tablero[0].length ; j++ ){
                System.out.print(Tablero[i][j]);
            }
            System.out.println("");
        }
    }
    
    //Funcion Comprobar Ganador
    public boolean Ganador(Jugador Jugador){
        boolean Resultado = false;
        String Ficha1 = " _"+Jugador.getFicha().getFicha()+"_ ";
        String Ficha3 = Ficha1+Ficha1+Ficha1;
        
        //Filas
        String Fila = Tablero[0][0]+Tablero[0][1]+Tablero[0][2];
        if(Ficha3.equals(Fila)){
            Resultado = true;
        }
        
        Fila = Tablero[1][0]+Tablero[1][1]+Tablero[1][2];
        if(Ficha3.equals(Fila)){
            Resultado = true;
        }
        
        Fila = Tablero[2][0]+Tablero[2][1]+Tablero[2][2];
        if(Ficha3.equals(Fila)){
            Resultado = true;
        }
        
        //Columnas
        String Columna = Tablero[0][0]+Tablero[1][0]+Tablero[2][0];
        if(Ficha3.equals(Columna)){
            Resultado = true;
        }
        
        Columna = Tablero[0][1]+Tablero[1][1]+Tablero[2][1];
        if(Ficha3.equals(Columna)){
            Resultado = true;
        }
        
        Columna = Tablero[0][2]+Tablero[1][2]+Tablero[2][2];
        if(Ficha3.equals(Columna)){
            Resultado = true;
        }
        
        //Diagonal
        String Diagonal = Tablero[0][0]+Tablero[1][1]+Tablero[2][2];
        if(Ficha3.equals(Diagonal)){
            Resultado = true;
        }
        
        Diagonal = Tablero[2][0]+Tablero[1][1]+Tablero[0][2];
        if(Ficha3.equals(Diagonal)){
            Resultado = true;
        }
        
       return Resultado;
    }
}
