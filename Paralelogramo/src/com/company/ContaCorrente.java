package com.company;

public class ContaCorrente {
    private String nome;
    private double saldo;
    public static int numeroContas = 0;

    ContaCorrente(String nome){
        this.nome = nome;
        this.saldo = 0.0;
        numeroContas++;
    }

    ContaCorrente(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        numeroContas++;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public String getTitular(){
        return this.nome;
    }
    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean sacar(double valor){
        if(valor <= saldo && valor > 0){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor){
        if(de.sacar(valor)){
            para.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public static int getQuantidadeContas(){
        return numeroContas;
    }
}
