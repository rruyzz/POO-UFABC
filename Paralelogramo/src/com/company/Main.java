package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Paralelogramo quadrado  = new Paralelogramo(10);
        Paralelogramo retangulo = new Paralelogramo(10, 20);
        Paralelogramo oQueSou   = new Paralelogramo(15, 15);

        // imprime "Paralelogramo quadrado"
        System.out.println(quadrado.getTipo());

        // imprime "Paralelogramo retangulo"
        System.out.println(retangulo.getTipo());

        // imprime "Paralelogramo quadrado"
        System.out.println(oQueSou.getTipo());
    }
}
