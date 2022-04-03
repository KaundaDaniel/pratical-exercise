package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] kaunda) {
        int valorSaque;
        int nota1 = 0;
        int nota2 = 0;
        int nota5 = 0;
        int nota4 = 0;
        int nota6 = 0;
        int nota10 = 0;
        int nota50 = 0;
        int nota100 = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Informe quanto de valor desja sacar");
        valorSaque = read.nextInt();
        if (valorSaque < 10) {
            System.out.println("O valor minímo para saque é 10");
        } else if (valorSaque <= 600) {
            nota1 = valorSaque % 10;
            if (nota1 <= 9) {
                nota2 = nota1 - 5;
            }
            nota5 = valorSaque / 10 % 10;
            nota4 = nota5 * 10;
            if (nota4 <= 90) {
                nota6 = nota4 - 50;
                nota100 = nota6 / 10 % 10;
            }
            nota10 = valorSaque / 100 % 10;
            System.out.println("Voce vai receber " + nota2 + " notas de 1kzs");
            System.out.println("Voce vai receber  de 1 nota de 5kzs");
            System.out.println("Voce vai receber " + nota100 + " notas  de 10kzs");
            System.out.println("Voce vai receber  de 1 nota de 50kzs");
            System.out.println("Voce vai receber  " + nota10 + " nota  de 100kzs");

        } else {

            System.out.println("Valor inválido");

        }
    }

}
