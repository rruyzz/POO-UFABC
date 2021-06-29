package com.company;

public class ZenitPolar implements Cifra {

    private char[] txtCriptografado;
    private char[] txtDesCriptografado;
    private final char[] valorLetraOriginal = {'z', 'e', 'n', 'i', 't', 'p', 'o', 'l', 'a', 'r', 'Z', 'E', 'N', 'I', 'T', 'P', 'O', 'L', 'A', 'R'};
    private final char[] valorLetraCriptografada = {'p', 'o', 'l', 'a', 'r', 'z', 'e', 'n', 'i', 't', 'P', 'O', 'L', 'A', 'R', 'Z', 'E', 'N', 'I', 'T'};

    public String cifrar(String mensagem) {
        txtCriptografado = mensagem.toCharArray();
        for (int i = 0; i < txtCriptografado.length; i++) {
            for (int j = 0; j < 20; j++) {
                if (txtCriptografado[i] == valorLetraOriginal[j]) {
                    txtCriptografado[i] = valorLetraCriptografada[j];
                    break;
                }
            }
        }
        return String.valueOf(txtCriptografado);
    }

    public String decifrar(String mensagem) {
        txtDesCriptografado = mensagem.toCharArray();
        for (int i = 0; i < txtDesCriptografado.length; i++) {
            for (int j = 0; j < 20; j++) {
                if (txtDesCriptografado[i] == valorLetraCriptografada[j]) {
                    txtDesCriptografado[i] = valorLetraOriginal[j];
                    break;
                }
            }
        }
        return String.valueOf(txtDesCriptografado);
    }
}
