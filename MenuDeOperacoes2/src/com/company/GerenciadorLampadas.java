package com.company;

public class GerenciadorLampadas {
    private LampadaInteligente[] vetorLampada;
    private int i = 0;

    public void adicionarLampada(){
        LampadaInteligente lampada = new LampadaInteligente();
        if(i<10) {
            vetorLampada[i] = lampada;
            i++;
        }
    }

    public void ligarLampada(int indiceLampada){
        if(!vetorLampada[indiceLampada].getEstado()){
            vetorLampada[indiceLampada].ligar();
        }
    }

    public void desligarLampada(int indiceLampada){
        if(vetorLampada[indiceLampada].getEstado()){
            vetorLampada[indiceLampada].desligar();
        }
    }

    public void ligarTodasLampadas(){
        for(int j = 0; j<vetorLampada.length; j++){
            vetorLampada[j].ligar();
        }
    }

    public void desligarTodasLampadas(){
        for(int j = 0; j<vetorLampada.length; j++){
            vetorLampada[j].desligar();
        }
    }
}

//        new LampadaInteligente(): lampada=0
//        new LampadaInteligente(): lampada=1
//        new LampadaInteligente(): lampada=2
//        (lampada=0) .getEstado() = false
//        (lampada=0) .ligar()
//        (lampada=1) .getEstado() = false
//        (lampada=1) .ligar()
//        (lampada=0) .getEstado() = true
//        (lampada=0) .getEstado() = true
//        (lampada=0) .desligar()
//        (lampada=0) .ligar()
//        (lampada=1) .ligar(): ja esta ligada.
//        (lampada=2) .ligar()
//        (lampada=0) .desligar()
//        (lampada=1) .desligar()
//        (lampada=2) .desligar()


//        new LampadaInteligente(): lampada=0
//        new LampadaInteligente(): lampada=1
//        new LampadaInteligente(): lampada=2
//        (lampada=0) .getEstado() = false
//        (lampada=0) .ligar()
//        (lampada=1) .getEstado() = false
//        (lampada=1) .ligar()
//        (lampada=0) .getEstado() = true
//        (lampada=0) .getEstado() = true
//        (lampada=0) .desligar()
//        (lampada=0) .getEstado() = false
//        (lampada=0) .ligar()
//        (lampada=1) .getEstado() = true
//        (lampada=2) .getEstado() = false
//        (lampada=2) .ligar()
//        (lampada=0) .getEstado() = true
//        (lampada=0) .desligar()
//        (lampada=1) .getEstado() = true
//        (lampada=1) .desligar()
//        (lampada=2) .getEstado() = true
//        (lampada=2) .desligar()
