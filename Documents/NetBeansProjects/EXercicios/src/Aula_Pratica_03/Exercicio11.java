package Aula_Pratica_03;

import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cont = 0;
        int numero1, numero2;
        System.out.println("Digite o primeiro numero");
        numero1 = read.nextInt();
        System.out.println("Digite o Segundo Número");
        numero2 = read.nextInt();
        while (numero1 < numero2) {
            System.out.println(numero1);
            numero1++;
            cont += numero1;

        }
        System.out.println("A soma é " + cont);
    }
}
