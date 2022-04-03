package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] kaunda) {
        Scanner read = new Scanner(System.in);
        int numero1;
        int numero2;
        double numero3;
        System.out.println("Insira dois números inteiros e um real");
        numero1 = read.nextInt();
        numero2 = read.nextInt();
        numero3 = read.nextDouble();
        int produto = ((numero1 * 2) * (numero2 / 2));
        int tripulo = numero1 * 3 + (int) numero3;
        double soma= Math.pow(numero3, 3);
        System.out.println("O produto do dobro do primeiro com metade do segundo é " + produto);
        System.out.println("A soma do triplo do primeiro com o terceiro: é " + tripulo);
        System.out.println("O terceiro elevado ao cubo é: " + soma);

    }

}
