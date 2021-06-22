package com.company;


public class Aluno extends Pessoa{

    @Override
    public String getEmail() {
        return super.nome + "." + super.sobrenome + "@aluno.ufabc.edu.br";
    }

    @Override
    public String getVinculo() {
        return  "Aluno da UFABC";
    }
}
