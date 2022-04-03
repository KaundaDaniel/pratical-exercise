package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] kaunda) {
        double lado1;
        double resultado1;
        double resultado2;
        Scanner read = new Scanner(System.in);
        System.out.println("Insira o lado do Quadrado");
        lado1 = read.nextDouble();
        resultado1 = lado1 * lado1;
        resultado2 = resultado1 * 2;
        System.out.println("A área do Quadadro é " + resultado1);
        System.out.println("O dobro da área do Quadrado é " + resultado2);

    }

}
