package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero1, numero2, soma;
        System.out.println("Insira o primeiro número");
        numero1 = read.nextInt();
        System.out.println("Insira o segundo número");
        numero2 = read.nextInt();
        soma = numero1 + numero2;
        System.out.println("A soma dos dois números é " + soma);
    }

}
