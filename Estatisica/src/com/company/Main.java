package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int matriz[][] = new int[n][n*2-1];
        int i = 0, j= 0;
        for(i = 0; i<n; i++){
            for(j = 0; j < n*2-1; j++){
                if(j+i <= n-1 || j-i >= n){
                    System.out.print("-");
                } else {
                    System.out.print("1");
                }
            }
            System.out.print("\n");
        }
    }

    public static void estatistica(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int value = 0, soma = 1, qtd = -1, min = -3, max = -1;
        double media;
        while (value >= 0) {
            value = leitor.nextInt();
            qtd+=1;
            soma += value;
            if (value < min && value != -1 || min == -3) {
                min = value;
            }
            if (value > max || max == -1) {
                max = value;
            }
        }
        if (soma != 0) {
            media = (soma/((double)qtd));
        } else {
            media = 0;
        }
        System.out.println(soma);
        System.out.println(String.format("%.2f", media));
        System.out.println(min);
        System.out.println(max);
    }
}
