package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero;
        System.out.println("Entre com um número");
        numero = read.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Numero par");
        } else if (numero % 2 == 1) {
            System.out.println("Numero impar");
        }
    }

}
