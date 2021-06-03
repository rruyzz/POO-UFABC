package com.company;

public class Porta {
    private Boolean aberta;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public Boolean estaAberta(){
        return this.aberta;
    }
    public int abrir(){
        if (aberta){
            return 1;
        } else {
            this.aberta = true;
            return 0;
        }
    }
    public int fechar(){
        if(aberta){
            this.aberta = false;
            return 0;
        } else {
            return 1;
        }
    }
}