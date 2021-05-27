package com.company;

import java.util.Scanner;

public class CompareVertor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int[] vetorA, vetorB;
        vetorA = new int[n];
        vetorB = new int[n];
        int i = 0;
        boolean isProporcional = true;
        double razao = -1;
        for (i = 0; i < n; i++) {
            vetorA[i] = leitor.nextInt();
        }
        for (i = 0; i < n; i++) {
            vetorB[i] = leitor.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (razao == -1 || razao == vetorA[i] / (double) vetorB[i]) {
                razao = vetorA[i] / (double) vetorB[i];
            } else {
                isProporcional =false;
            }
        }
        if (isProporcional) {
            System.out.print("SIM");
        } else {
            System.out.print("NAO");
        }
    }
}
