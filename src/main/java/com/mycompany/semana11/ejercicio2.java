/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana11;
    import java.util.Arrays;
    import java.util.Scanner;

/**
 *
 * @author Arias Vilcapoma, Luis Steeven
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz Original:");
        imprimirMatriz(matriz);

        System.out.println("\nMatriz Ordenada por Filas:");
        ordenarMatrizPorFilas(matriz);
        imprimirMatriz(matriz);

        System.out.println("\nMatriz Ordenada por Columnas:");
        ordenarMatrizPorColumnas(matriz);
        imprimirMatriz(matriz);

        scanner.close();
    }
    public static void ordenarMatrizPorFilas(int[][] matriz) {
        for (int[] fila : matriz) {
            Arrays.sort(fila); 
        }
    }
    public static void ordenarMatrizPorColumnas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int j = 0; j < columnas; j++) {
            int[] columna = new int[filas];
            for (int i = 0; i < filas; i++) {
                columna[i] = matriz[i][j];
            }
            Arrays.sort(columna);
            for (int i = 0; i < filas; i++) {
                matriz[i][j] = columna[i];
            }
        }
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}



