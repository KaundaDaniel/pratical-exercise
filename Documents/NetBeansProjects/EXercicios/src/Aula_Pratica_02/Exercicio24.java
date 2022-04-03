package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;
        int operacacao;
        System.out.println("Entre com o primeiro número");
        numero1 = read.nextInt();
        System.out.println("Entre com o segundo número");
        numero2 = read.nextInt();
        System.out.println("Que operação deseja realizar? \n 1- Adição \n 2- Subtração \n 3- Multiplicação \n 4- Divisão");
        operacacao = read.nextInt();
        switch (operacacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("A soma dos dois números é " + resultado);
                if (resultado % 2 == 0) {
                    System.out.println(resultado + " É Par");
                } else if (resultado % 2 == 1) {
                    System.out.println(resultado + " É Impar");
                }
                if (resultado > 0) {
                    System.out.println(resultado + " É Positivo");
                } else {
                    System.out.println(+resultado + " É Negativo");
                }

                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("A Subtração do primeiro com o segundo é " + resultado);
                if (resultado % 2 == 0) {
                    System.out.println(resultado + " É Par");
                } else if (resultado % 2 == 1) {
                    System.out.println(resultado + " É Impar");
                }
                if (resultado > 0) {
                    System.out.println(resultado + " É Positivo");
                } else {
                    System.out.println(+resultado + " É Negativo");
                }

                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("A Multiplicação dos dois números é " + resultado);
                if (resultado % 2 == 0) {
                    System.out.println(resultado + " É Par");
                } else if (resultado % 2 == 1) {
                    System.out.println(resultado + " É Impar");
                }
                if (resultado > 0) {
                    System.out.println(resultado + " É Positivo");
                } else {
                    System.out.println(+resultado + " É Negativo");
                }

                break;

            case 4:
                resultado = numero1 / numero2;
                System.out.println("A Divisão do primeiro com o segundo é " + resultado);
                if (resultado % 2 == 0) {
                    System.out.println(resultado + " É Par");
                } else if (resultado % 2 == 1) {
                    System.out.println(resultado + " É Impar");
                }
                if (resultado > 0) {
                    System.out.println(resultado + " É Positivo");
                } else {
                    System.out.println(+resultado + " É Negativo");
                }

                break;
            default:
                System.out.println("Impossível realizar a operação");

        }
    }

}
