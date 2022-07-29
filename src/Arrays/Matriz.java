package Arrays;

public class Matriz {
    public static void main(String[] args) {

        int [] [] arrayMatriz = new int[3][4]; //int [fila] [columna]
        String [] [] frutas = {{"Naranja", "Ciruela"}, {"Pera", "Manzana"}, {"Durazno", "Pomelo"}};


        for (int fila = 0; fila < frutas.length; fila++){
            for (int col = 0; col < frutas[fila].length; col++){
                System.out.println("Frutas " + fila + "-" + col + ":" + frutas[fila][col]);
            }//recorre las columnas
        }//recorre las filas
    }


}
