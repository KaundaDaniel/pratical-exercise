package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int media;
        int nota1, nota2;
        System.out.println("Insira a primeira nota");
        nota1 = read.nextInt();
        System.out.println("Insira a segunda nota");
        nota2 = read.nextInt();
        media = (nota1 + nota2) / 2;
        if  (media == 10) {
            System.out.println("Aprovado  com Distinção " + media);
        } else if (media < 7) {
            System.out.println("Reprovado " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado  " + media);
        }

    }

}


