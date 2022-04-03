package Aula_Pratica_03;

import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio18 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero;
        int factorial;
        System.out.println("Digite o numero");
        numero = read.nextInt();
        factorial=numero;
        while (numero >= 0) {
            factorial =numero*(numero-1);
            numero--;
        }
        System.out.println("O Factorial " + factorial);
    }

}
