package Aula_Pratica_03;

import java.util.Scanner;

public class notasAluno {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numero = new int[5];
        int soma = 0;
        int mult = 1;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um numero");
            numero[i] = read.nextInt();
            soma += numero[i];
            mult = mult * numero[i];

        }
        for (int lerNumero : numero) {
            System.out.print(" " + lerNumero);
        }
        System.out.println(" ");
        System.out.println("A soma é "+soma);
        System.out.println("A Multiplicação é " + mult);

    }

}
