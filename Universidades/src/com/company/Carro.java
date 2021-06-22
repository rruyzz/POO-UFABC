package com.company;

public class Carro extends Veiculo{

    int portas;

    @Override
    public String getTipo(){
        return  "Carro modelo " + super.modelo;
    }

    public void setNumeroPortas(int nPortas){
        this.portas = nPortas;
    }

    public int getNumeroPortas(){
        return this.portas;
    }
}
