package com.company;

public class CartaoDebito {

    private String titular;
    private double saldo;

    CartaoDebito(){
        this.saldo = saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void AdicionarSaldoDebito(double valor){
        this.saldo = valor;
    }

    public double verificarSaldoDebito(){
        return this.saldo;
    }

    public boolean pagarComDebito(double valor){
        if(valor<saldo){
            saldo-=valor;
            return true;
        } else {
            return false;
        }
    }
}
