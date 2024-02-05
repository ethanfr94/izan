/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio2;

/**
 *
 * @author DAM122
 */
public class Matriz {
    private int[][] matriz;    
    public Matriz() {//crea una tabla de multiplicar
        matriz = new int[10][10];
        for (int i = 0; i < 10; i++) {
            matriz[0][i]=i;
            matriz[i][0]=i;}}    
    public void multiplica() {//rellena la tabla
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i!=0 && j!=0) {
                    matriz[i][j]=matriz[0][j]*matriz[i][0];}}}}    
    public void muestra() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");}
            System.out.println("");}}    
    public int[] valoresAspa() {//nos enseña un array con los valores 
        int[] aspa = new int[20];//que forman una x en la tabla
        int cont = 0;//NO DIBUJA UN ASPA
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j || matriz.length==i+j+1) {
                    aspa[cont] = matriz[i][j];
                    cont++;}}}
        return aspa;}    
    public int[] tablaMultiplicar(int n) {
        //nos enseña la tabla seleccionada por parametro
        int[] tabla = new int[9];
        for (int i = 1; i < matriz[n].length; i++) {
            tabla[i-1] = matriz[n][i];}
        return tabla;}}
