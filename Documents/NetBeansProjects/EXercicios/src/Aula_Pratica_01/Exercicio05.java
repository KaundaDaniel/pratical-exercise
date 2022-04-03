package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int n1, n2, n3, n4;
        double media;
        Scanner read = new Scanner(System.in);
        System.out.println("Insira as 4 notas");
        n1 = read.nextInt();
        n2 = read.nextInt();
        n3 = read.nextInt();
        n4 = read.nextInt();
        media = ((n1 + n2 + n3 + n4) / 4);
        System.out.println("A média é " + media);

    }

}
