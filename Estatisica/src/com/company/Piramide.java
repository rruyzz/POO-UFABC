package com.company;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int matriz[][] = new int[n][n*2-1];
        int i = 0, j= 0;
        for(i = 0; i<n; i++){
            for(j = 0; j < n*2-1; j++){
               if(j+i < n-1 || j-i >= n){
                   System.out.print("-");
               } else {
                   System.out.print("1");
               }
            }
            System.out.print("\n");
        }
    }
}
//LINHAS  -> COLUNAS
//6 -> 11
//5 -> 9
//4 -> 7
//3 -> 5
//2 -> 3
//1 -> 1
//if(j+i<=n-1 print -)
//if(j-i >= n)
//                  4 5

//  00  01  02  03  04  05  06  07  08
//  10  11  12  13  14  15  16  17  18
//  20  21  22  23  24  25  26  27  28
//  30  31  32  33  34  35  36  37  38
//  40  41  42  43  44  45  46  47  48

//  -   -   -   -   1   -   -   -   -
//  -   -   -   1   1   1   -   -   -
//  -   -   1   1   1   1   1   -   -
//  -   1   1   1   1   1   1   1   -
//  1   1   1   1   1   1   1   1   1