package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] kaunda) {
        Scanner read = new Scanner(System.in);
        double altura;
        System.out.println("Insira a sua Altura");
        altura=read.nextDouble();
        double altHome= (72.7*altura) - 58;
        double altMulh= (62.1*altura) - 44.7;
        System.out.println("Para Homem a altura ideal é " + altHome);
        System.out.println("Para Mulher a altura ideal é " + altMulh);
        
    }

}
