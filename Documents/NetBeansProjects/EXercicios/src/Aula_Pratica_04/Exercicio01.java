package Aula_Pratica_04;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int idade[] = new int[5];
        float[] peso = new float[5];
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Insira a " + (i + 1) + " idade");
            idade[i] = read.nextInt();
            System.out.println("Insira a sua altura");
            peso[i] = read.nextFloat();

        }
        System.out.println("idades ");
        for (int i = idade.length-1; i >= 0; i--) {
            System.out.print(" "+ idade[i]);
            System.out.println(" "+ peso[i]);

        }
        System.out.println(" ");
    }

}
