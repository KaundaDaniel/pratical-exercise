package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double valorMetro;
        double ValorConvertido;
        System.out.println("Insira o valor em Metro");// Inserir valor com virgula não com ponto
        valorMetro = read.nextDouble();
        ValorConvertido = valorMetro * 100;
        System.out.println("O número Convertido em Centimetro é " + ValorConvertido + " Cm");
    }

}
