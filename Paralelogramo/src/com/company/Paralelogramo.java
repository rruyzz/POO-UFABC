package com.company;

public class Paralelogramo {
    int ladoA;
    int ladoB;

    public Paralelogramo(int ladoA){
        this.ladoA = ladoA;
        this.ladoB = -1;
    }
    public Paralelogramo(int ladoA, int ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public int getArea(){
        if(ladoB == -1) {
            return ladoA * ladoA;
        } else {
            return ladoA * ladoB;
        }
    }

    public String getTipo(){
        if(ladoB == -1){
            return "Paralelogramo quadrado";
        }
        if(ladoA == ladoB){
            return "Paralelogramo quadrado";
        } else {
            return "Paralelogramo retangulo";
        }
    }
}
