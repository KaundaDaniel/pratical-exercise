package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;

        System.out.println("Entre com a primeira nota");
        nota1 = read.nextDouble();
        System.out.println("Entre com a segunda nota");
        nota2 = read.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media > 0 && media <= 4.0) {
            System.out.println("Reprovado com a nota E ");

        } else if (media > 4.0 && media <= 6.0) {
            System.out.println("Reprovado com a nota de D");
        } else if (media > 6.0 && media <= 7.5) {
            System.out.println("Parabéns teve uma nota de C");
        } else if (media > 7.5 && media <= 9.0) {
            System.out.println("Parabéns teve uma nota de B");

        } else if (media > 9.0 && media <= 10.0) {
            System.out.println("Parabéns teve uma nota de A");
        }
    }

}
