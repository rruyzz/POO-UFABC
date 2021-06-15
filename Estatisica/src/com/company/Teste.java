package com.company;

public class Teste {
    public static void main(String[] args) {
        int n, k, i , j;
        n=25;
        k = n*n;
        for(i = 0; i<n; i++){
            for(j = i; j<n; j++){
               k -= 1;
            }
        }
        System.out.println(k);
    }
}
