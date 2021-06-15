package com.company;

public class back {
//
//    package empresa;
//
//    public class Pedido {
//        int code = 0, qtd = 0, i = 0, k =0, aux = 0, otheraux= 0, finalSize = 0;
//
//        int[] pedido = new int[5];
//        boolean isCancel = false, isDelivery = false;
//
//        public boolean adicionarProduto(int codProduto) {
//            if (i < 5 && !isDelivery) {
//                pedido[i] = codProduto;
//                i++;
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        public int vetorSize(int[] p){
//            int x = 0;
//            for(x=0; x<p.length; x++){
//                if(p[x] != 0){
//                    x++;
//                }
//            }
//            return x;
//        }
//
//        public int[] entregar() {
//            for(k=0; k<pedido.length; k++){
//                if(pedido[k] != 0){
//                    aux++;
//                }
//            }
//            int[] pedidoDelivery = new int[aux];
//            if (pedido.length > 0 && !isCancel) {
//                isDelivery = true;
//                for(k = 0; k<aux; k++){
//                    if(pedido[k] != 0){
//                        pedidoDelivery[otheraux] = pedido[k];
//                        otheraux++;
//                    }
//                }
//                return pedidoDelivery;
//            }
//            return null;
//
//        }
//
//        public boolean cancelar() {
//            if(!isDelivery){
//                isCancel = true;
//            }
//            return isCancel;
//        }
//
//        public boolean somarPedido(Pedido p) {
//            if(returnWithOutZero(p.pedido).length + returnWithOutZero(pedido).length < 5){
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        public int[] returnWithOutZero(int[] p) {
//            int withOutZero= returnWithOutZeroSize(p);
//            int[] pedidoWithOutZero = new int[withOutZero];
//            int auxx = 0;
//
//            for (k = 0; k < p.length; k++) {
//                if (p[k] != 0) {
//                    pedidoWithOutZero[auxx] = p[k];
//                    auxx++;
//                }
//            }
//            return pedidoWithOutZero;
//        }
//
//        public int returnWithOutZeroSize(int[] p ){
//            int withOutZero= 0;
//            for (k = 0; k < p.length; k++) {
//                if (p[k] != 0) {
//                    withOutZero++;
//                }
//            }
//            return withOutZero;
//        }
//    }
}
