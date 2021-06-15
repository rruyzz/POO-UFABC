package com.company;

import java.util.Arrays;

import static com.company.Main.printVetor;

public class Pedido {
    int code = 0, qtd = 0, i = 0, k = 0, aux = 0, otheraux = 0, finalSize = 0;

    int[] pedido = new int[5];
    int[] pedidoZero = new int[returnWithOutZeroSize(pedido)];
    boolean isCancel = false, isDelivery = false, isInit = false;

    public boolean adicionarProduto(int codProduto) {
        if (i < 5 && !isDelivery) {
            isInit = true;
            pedido[i] = codProduto;
            i++;
            return true;
        } else {
            return false;
        }
    }

    public int vetorSize(int[] p) {
        int x = 0;
        for (x = 0; x < p.length; x++) {
            if (p[x] != 0) {
                x++;
            }
        }
        return x;
    }

    public int returnWithOutZeroSize(int[] p) {
        int withOutZero = 0;
        for (k = 0; k < p.length; k++) {
            if (p[k] != 0) {
                withOutZero++;
            }
        }
        return withOutZero;
    }

    public int[] returnWithOutZero(int[] p) {
        int withOutZero = returnWithOutZeroSize(p);
        int[] pedidoWithOutZero = new int[withOutZero];
        int auxx = 0;

        for (k = 0; k < p.length; k++) {
            if (p[k] != 0) {
                pedidoWithOutZero[auxx] = p[k];
                auxx++;
            }
        }
        return pedidoWithOutZero;
    }

    public int[] entregar() {
        for (k = 0; k < pedido.length; k++) {
            if (pedido[k] != 0) {
                aux++;
            }
        }
        int[] pedidoDelivery = new int[aux];
        if (isInit && !isCancel) {
            isDelivery = true;
            for (k = 0; k < aux; k++) {
                if (pedido[k] != 0) {
                    pedidoDelivery[otheraux] = pedido[k];
                    otheraux++;
                }
            }
            return pedidoDelivery;
        } else {
            return null;
        }

    }

    public boolean cancelar() {
        if (!isDelivery) {
            isCancel = true;
        }
        return isCancel;
    }

    public boolean somarPedido(Pedido p) {
        int size = returnWithOutZero(p.pedido).length + returnWithOutZero(pedido).length;
        int[] pedidoSomado = new int[size];
        int m = 0;

        for (int x = 0; x < returnWithOutZero(p.pedido).length; x++) {
            pedidoSomado[x] = returnWithOutZero(p.pedido)[x];
        }

        for (int x = returnWithOutZero(p.pedido).length; x < size; x++) {
            pedidoSomado[x] = returnWithOutZero(pedido)[m];
            m++;
        }

        pedido = returnWithOutZero(removeDupes(returnWithOutZero(pedidoSomado)));
        if(returnWithOutZero(removeDupes(returnWithOutZero(pedidoSomado))).length<=5){
            pedido = returnWithOutZero(removeDupes(returnWithOutZero(pedidoSomado)));
            return true;
        } else {
            return false;
        }
    }

    private int[] removeDupes(int[] a) {
        int[] pedidoWithOutDouble = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int b = 0;
        a[b] = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[b] != a[i]) {
                b++;
                a[b] = a[i];

            }
        }
        for (int i = 0; i <= b; i++) {
            pedidoWithOutDouble[i] = a[i];
        }
        return pedidoWithOutDouble;
    }
}
