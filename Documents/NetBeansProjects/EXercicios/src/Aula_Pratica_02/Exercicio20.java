package Aula_Pratica_02;

import java.util.Scanner;


public class Exercicio20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;
        System.out.println("Entre com a primeira nota");
        nota1 = read.nextDouble();
        System.out.println("Entre com a segunda nota");
        nota2 = read.nextDouble();
        System.out.println("Entre com a terceira nota");
        nota3 = read.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Aprovado  com a nota de " + media);
        } else if (media < 7) {
            System.out.println("Reprovado com a nota de " + media);
        }else if(media==10.0){
            System.out.println("Aprovado com Distinção com a nota de " + media);
        }
    }
}


