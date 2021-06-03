package com.company;

public class GerenciadorLampadas {
    LampadaInteligente[] vetorLampada;
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
