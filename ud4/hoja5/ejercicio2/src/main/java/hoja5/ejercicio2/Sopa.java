/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

/**
 *
 * @author usuario
 */
public class Sopa {
    char [][] sopa;
    
    public Sopa(){
        sopa = new char [10][20];
    }
    
    public Sopa(int filas, int columnas){
        sopa = new char[filas][columnas];
    }
    
    public void inicializar() {
        char letra = 0;
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                letra = (char) Math.floor(Math.random()*(90-65)+65);
                sopa[i][j] = letra;
            }
        }
        System.out.println("sopa de letras creada");
    }
    
    public void setPalabra(String palabra, int x, int y, int D){
        if (D != 1 && D != -1) {
            System.out.println("Dirección no válida. D debe ser 1 o -1.");
            return;
        }

        // Verificar si la palabra cabe en el tablero en la dirección especificada
        if (D == 1 && (y + palabra.length() > sopa[0].length)) {
            System.out.println("La palabra no cabe en la dirección horizontal desde la posición especificada.");
            return;
        }

        if (D == -1 && (x + palabra.length() > sopa.length)) {
            System.out.println("La palabra no cabe en la dirección vertical desde la posición especificada.");
            return;
        }

        // Agregar la palabra en la posición especificada y en la dirección especificada
        if (D == 1) {
            // Dirección horizontal
            for (int i = 0; i < palabra.length(); i++) {
                sopa[x][y + i] = palabra.toUpperCase().charAt(i);
            }
        } else {
            // Dirección vertical
            for (int i = 0; i < palabra.length(); i++) {
                sopa[x + i][y] = palabra.toUpperCase().charAt(i);
            }
        }
    }
    
    public void mostrar(){
        for(char[] fila : sopa){
            for(char columna : fila){
                System.out.print(columna+"  ");
            }System.out.println("");
        }
    }
}
