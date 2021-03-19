package com.company;

public class Main {

    public static void main(String[] args) {
        Temperatura.dias=9;
        Temperatura temp= new Temperatura();
        temp.obter();
        temp.calcularMedia();
        temp.verificar();
        temp.mostraTemperaturas();
         /*
        Exer13.tamanho=5;
        Exer13  exer= new Exer13();
        exer.obter();
        exer.exibirInfos();*/
    }
}
