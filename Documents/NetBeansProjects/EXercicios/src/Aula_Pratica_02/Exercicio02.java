package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int valor;
        System.out.println("Entre com um valor");
        valor = read.nextInt();
        if (valor >= 0) {
            System.out.println("O valor é positivo");

        } else {
            System.out.println("O valor é negativo");
        }
    }

}
