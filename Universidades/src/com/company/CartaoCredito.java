package com.company;


public class CartaoCredito extends CartaoDebito{

    public double credito;

    public CartaoCredito(){
        this.credito = 0;
    }

    public boolean pagarComCredito(double valor){
        this.credito+=valor;
        return true;
    }

    public void quitarCredito(double valor){
        this.credito -= valor;
    }

    public double verificarExtrato(){
        return this.credito;
    }
}
