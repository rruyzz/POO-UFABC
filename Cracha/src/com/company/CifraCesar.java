package com.company;

public class CifraCesar implements Cifra {
    int nShifts;
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    char[] arrayAlfabeto = alfabeto.toCharArray();

    public CifraCesar(int nShifts) {
        this.nShifts = nShifts;
    }

    public String cifrar(String mensagem) {
        char alphabet;
        String ciphertext = "";
        for (int i = 0; i < mensagem.length(); i++) {
            alphabet = mensagem.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                // shift alphabet
                alphabet = (char) (alphabet + this.nShifts);
                if (alphabet > 'z') {
                    // reshift to starting position
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + this.nShifts);
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else {
                ciphertext = ciphertext + alphabet;
            }
        }
        return ciphertext;
    }

    public String decifrar(String mensagem) {
        String decryptMessage = "";
        for (int i = 0; i < mensagem.length(); i++) {
            char alphabet = mensagem.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet - this.nShifts);
                if (alphabet < 'a') {
                    alphabet = (char) (alphabet - 'a' + 'z' + 1);
                }
                decryptMessage = decryptMessage + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet - this.nShifts);
                if (alphabet < 'A') {
                    alphabet = (char) (alphabet - 'A' + 'Z' + 1);
                }
                decryptMessage = decryptMessage + alphabet;
            } else {
                decryptMessage = decryptMessage + alphabet;
            }
        }
        return decryptMessage;
    }
}
