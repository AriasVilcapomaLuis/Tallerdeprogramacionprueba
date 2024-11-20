/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana11;

/**
 *
 * @author Arias Vilcapoma, Luis Steeven
 */
public class Semana11 {
    public static void main(String[] args) {
        int[][] datos = {
            {5, 8, 3},
            {7, 1, 6},
            {4, 9, 2}
        };

        generarReporteAscii(datos);
    }

    public static void generarReporteAscii(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de la Matriz\n");
        reporte.append("=====================\n");
        reporte.append("Datos:\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                reporte.append(String.format("%5d", matriz[i][j])); 
            }
            reporte.append(" | Suma Fila ").append(i + 1).append(": ").append(sumaFilas[i]).append("\n");
        }
        reporte.append("\nSuma de cada Columna:\n");
        for (int j = 0; j < columnas; j++) {
            reporte.append(String.format("Columna %d: %d\n", j + 1, sumaColumnas[j]));
        }

        System.out.println(reporte.toString());
    }
}

    

