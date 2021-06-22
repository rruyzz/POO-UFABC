package com.company;

public class CartaoLimitado extends CartaoCredito {


    public boolean pagarComCredito(double valor) {
        if (valor + super.verificarExtrato() <= 200) {
            super.credito += valor;
            return true;
        } else {
            return false;
        }
    }
}
