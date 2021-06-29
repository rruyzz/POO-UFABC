package com.company;

public class CrachaEstudante extends Cracha{

    String curso;
    public void setCurso(String curso){
        this.curso = curso;
    }

    @Override
    public void imprimir(){
        Impressao.imprimirLinha("ESTUDANTE");
        Impressao.imprimirLinha("Nome: " + super.name);
        Impressao.imprimirLinha("Curso: " + this.curso);
    }
}
