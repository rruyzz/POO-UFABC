package com.company;

import java.util.Scanner;

public class CampoMinado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int row = leitor.nextInt();
        int column = leitor.nextInt();
        int[][] map = new int[row][column];
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                map[i][j] = leitor.nextInt();
            }
        }
        int rowBomb;
        int collumnBomb;
        int bomb = 0;
        rowBomb = leitor.nextInt();
        collumnBomb = leitor.nextInt();
        for(i = rowBomb-1; i <= rowBomb +1 ; i ++){
            for(j = collumnBomb-1; j<= collumnBomb + 1; j++){
                if((i != rowBomb|| j != collumnBomb )&& (i >= 0 && i != row && j >= 0 && j != column)){
                    if( map[i][j] == 1){
                        bomb++;
                    }
                }
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(map[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println(bomb);
    }
}

//  00  01  02  03  04  05  06  07  08
//  10  11  12  13  14  15  16  17  18
//  20  21  22  23  24  25  26  27  28
//  30  31  32  33  34  35  36  37  38
//  40  41  42  43  44  45  46  47  48