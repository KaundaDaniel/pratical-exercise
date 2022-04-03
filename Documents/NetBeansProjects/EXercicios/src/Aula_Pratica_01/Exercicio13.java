package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] kaunda) {
        Scanner read = new Scanner(System.in);
        double altura;
        System.out.println("Insira uma altura");
        altura=read.nextDouble();
        double peso=(72.7*altura)-58;
        System.out.println("o seu peso ideal é " + peso);
        ///System.out.println(2^3);
    }

}
