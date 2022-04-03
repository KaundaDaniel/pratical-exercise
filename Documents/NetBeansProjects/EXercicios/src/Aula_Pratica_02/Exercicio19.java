package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero;
        int unidade;
        int dezena;
        int centena;
        int milhar;
        System.out.println("Insira um número menor que 1000");
        numero = read.nextInt();
        if (numero < 1000) {
            unidade = numero % 10;
            dezena = numero / 10 % 10;
            centena = numero / 100 % 10;
            milhar = numero / 1000 % 10;

            System.out.println("O número tem:");
            System.out.println(unidade + " Unidades");
            System.out.println(dezena + " Dezenas");
            System.out.println(centena + " Centenas");
            System.out.println(milhar + " Milhar");
        } else {
            System.out.println("Número inválido");
        }
    }

}
