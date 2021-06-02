package com.company;

import java.util.Scanner;

public class TestesDiscosVoadores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int row = leitor.nextInt();
        int column = leitor.nextInt();
        int i, j;
        int[][] matriz = new int[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        printMatriz(ordemRow(matriz));
        System.out.print("\n");
        printMatriz(ordemColumn(matriz));
    }

    public static int[][] ordemColumn(int[][] matriz) {
        int i, j, k;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                for (k = 0; k < matriz[i].length - j - 1; k++) {
                    if (matriz[i][k] > matriz[i][k + 1]) {
                        int t = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = t;
                    }
                }
            }
        }
        return matriz;
    }

    public static int[][] ordemRow(int[][] matriz) {
        int i, j, k;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                for (k = 0; k < matriz[i].length - j - 1; k++) {
                    if (matriz[k][i] > matriz[k+1][i]) {
                        int t = matriz[k][i];
                        matriz[k][i] = matriz[k+1][i];
                        matriz[k + 1][i] = t;
                    }
                }
            }
        }
        return matriz;
    }

    public static void printMatriz(int[][] matriz) {
        int j, i;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if(j != matriz[i].length-1){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
