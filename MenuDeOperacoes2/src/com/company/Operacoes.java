package com.company;

public class Operacoes {
    public int a, b, c, soma2, soma3, produto, soma2Exe = 0, soma3Exe = 0, produtoExe = 0;

    public void setA(int A) {
        this.a = A;
    }

    public void setB(int B) {
        this.b = B;
    }

    public void setC(int C) {
        this.c = C;
    }

    public int soma2() {
        this.soma2 = a + b;
        this.soma2Exe = -1;
        return soma2;
    }

    public int soma3() {
        this.soma3 = a + b + c;
        this.soma3Exe = -1;
        return soma3;
    }

    public int multiplica() {
        this.produto = a * b;
        this.produtoExe = -1;
        return produto;
    }

    public int getMin() {
        if(soma2Exe == -1 && soma3Exe == -1 && produtoExe== -1){
            if (soma2 < soma3 && soma2 < produto){
                return soma2;
            } else if( soma3 < produto){
                return soma3;
            }else return produto;
        }
        if(soma2Exe == -1 && soma3Exe == -1 && produtoExe== 0){
            if(soma2<soma3){
                return soma2;
            } else return soma3;
        }
        if(soma2Exe == -1 && soma3Exe == 0 && produtoExe == -1){
            if(soma2 < produto){
                return soma2;
            } else {
                return produto;
            }
        }
        if(soma2Exe == 0 && soma3Exe == -1 && produtoExe== -1){
            if(soma3<produto){
                return soma3;
            } else {
                return produto;
            }
        }
        if(soma2Exe == -1 && soma3Exe == 0 && produtoExe== 0){
            return soma2;
        }
        if(soma2Exe == 0 && soma3Exe == -1 && produtoExe== 0){
            return soma3;
        }
        if(soma2Exe == 0 && soma3Exe == 0 && produtoExe== -1) {
            return produto;
        }
        return -1000;
    }

    public int getMax() {
        if(soma2Exe == -1 && soma3Exe == -1 && produtoExe== -1){
            if (soma2 > soma3 && soma2 > produto){
                return soma2;
            } else if( soma3 > produto){
                return soma3;
            }else return produto;
        }
        if(soma2Exe == -1 && soma3Exe == -1 && produtoExe== 0){
            if(soma2>soma3){
                return soma2;
            } else return soma3;
        }
        if(soma2Exe == -1 && soma3Exe == 0 && produtoExe == -1){
            if(soma2 > produto){
                return soma2;
            } else {
                return produto;
            }
        }
        if(soma2Exe == 0 && soma3Exe == -1 && produtoExe== -1){
            if(soma3>produto){
                return soma3;
            } else {
                return produto;
            }
        }
        if(soma2Exe == -1 && soma3Exe == 0 && produtoExe== 0){
            return soma2;
        }
        if(soma2Exe == 0 && soma3Exe == -1 && produtoExe== 0){
            return soma3;
        }
        if(soma2Exe == 0 && soma3Exe == 0 && produtoExe== -1) {
            return produto;
        }
        return 10000;
    }

//    public int getMin() {
//        if (soma2 < soma3 && soma2 < produto && soma2Exe == -1) {
//            return soma2;
//        }
//        if (soma3 < produto && soma3Exe == -1) {
//            return soma3;
//        }
//        if (produtoExe == -1) {
//            return produto;
//        }
//        if (soma2Exe == -1) {
//            return soma2;
//        }
//        if (soma3Exe == -1) {
//            return soma3;
//        }
//        return 1000;
//    }
//
//    public int getMax() {
//        if (soma2 > soma3 && soma2 > produto && soma2Exe == -1) {
//            return soma2;
//        } else if (soma3 > produto && soma3Exe == -1) {
//            return soma3;
//        }
//        if (produtoExe == -1) {
//            return produto;
//        }
//        if (soma2Exe == -1) {
//            return soma2;
//        }
//        if (soma3Exe == -1) {
//            return soma3;
//        }
//        return 1000;
//    }
}