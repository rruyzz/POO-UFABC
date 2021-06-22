package com.company;


public class Veiculo {
    protected String modelo;

    public String getTipo(){
        return  "Veiculo generico modelo " + this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
