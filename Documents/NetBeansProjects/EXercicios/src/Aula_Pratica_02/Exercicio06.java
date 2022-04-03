package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("Insira o primeiro número");
        numero1 = read.nextInt();
        System.out.println("Insira o segundo número");
        numero2 = read.nextInt();
        System.out.println("Insira o terceiro número");
        numero3 = read.nextInt();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O número " + numero1 + " é maior");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O número " + numero2 + " é maior");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O número " + numero3 + " é maior");
        }
        /*
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("O número " + numero1 + " é menor");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("O número " + numero2 + " é menor");

        } else if (numero3 < numero1 && numero3 < numero2) {
             System.out.println("O número " + numero3 + " é menor");
        }
*/
    }

}
