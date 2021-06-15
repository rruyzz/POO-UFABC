package com.company;

public class Main {

    public static void main(String[] args) {
        Pedido a = new Pedido();
        Pedido b = new Pedido();
        Pedido c = new Pedido();

        System.out.println(c.entregar());
//        a.adicionarProduto(10);
//        a.adicionarProduto(20);
//        a.adicionarProduto(30);
//
//
//        b.adicionarProduto(20);
//        b.adicionarProduto(15);
//        b.adicionarProduto(40);
//        b.adicionarProduto(30);
//
////        printVetor(b.pedido);
//        System.out.println(a.somarPedido(b));
////        b.returnWithOutZero(b);
//        a.somarPedido(b);
    }

    public static void printVetor(int[] matriz) {
        int j, i;
        for (i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }
    }
}
