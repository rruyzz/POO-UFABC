package com.company;

public class Quadrado extends Retangulo{

    public void setLados(double ladoAB) {
        super.setLados(ladoAB, ladoAB, ladoAB, ladoAB);
    }

    @Override
    public String getPropriedades(){
        return super.getPropriedades() + " Todos os lados tem o mesmo tamanho.";
    }
}
