package com.company;

public class CrachaFuncionario extends Cracha{
    String cargo;
    int mes, ano;

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setDataAdmissao(int m, int a){
        this.mes = m;
        this.ano = a;
    }
    @Override
    public void imprimir(){
        Impressao.imprimirLinha("FUNCIONARIO");
        Impressao.imprimirLinha("Nome: " + super.name);
        Impressao.imprimirLinha("Cargo: " + this.cargo);
        Impressao.imprimirLinha("Admissao: " + this.mes + "/" + this.ano);
    }
}
