package com.company;

public class Pessoa {

    String nome;
    String sobrenome;

    public void setNomeSobrenome(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return this.nome + "." + this.sobrenome + "@dominio.generico.com.br";
    }

    public String getVinculo(){
        return "Sem vinculo com a UFABC";
    }

}
