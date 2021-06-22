package com.company;


public class Motocicleta extends Veiculo{

    boolean hasCarro;

    @Override
    public String getTipo(){
        return  "Motocicleta modelo "+ super.modelo;
    }

    public void setTemCarroLateral(boolean temCarroLateral){
        this.hasCarro = temCarroLateral;
    }

    public boolean getTemCarroLateral(){
        return this.hasCarro;
    }

}
