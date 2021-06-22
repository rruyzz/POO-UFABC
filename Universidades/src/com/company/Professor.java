package com.company;

public class Professor extends Pessoa{

    @Override
    public String getEmail() {
        return super.nome + "." + super.sobrenome + "@ufabc.edu.br";
    }

    @Override
    public String getVinculo() {
        return  "Professor da UFABC";
    }
}
