package com.company;

public class Paralelogramo extends Quadrilatero{

    public void setLados(double ladoAB, double ladoBCA) {
        super.setLados(ladoAB, ladoBCA, ladoAB, ladoBCA);
    }

    @Override
    public String getPropriedades(){
        return super.getPropriedades() + " Lados opostos paralelos.";
    }
}


//    public void setLados(double ladoA, double ladoB){
//        super.ladoAB = ladoA;
//        super.ladoBC = ladoB;
//        super.ladoCD = ladoA;
//        super.ladoDA = ladoB;
//    }