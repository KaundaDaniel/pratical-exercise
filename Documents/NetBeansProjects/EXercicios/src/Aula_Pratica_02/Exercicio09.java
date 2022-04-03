package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        System.out.println("Insira o primeiro número");
        numero1 = read.nextInt();
        System.out.println("Insira o segundo número");
        numero2 = read.nextInt();
        System.out.println("Insira o segundo número");
        numero3 = read.nextInt();
        if (numero1 < numero2 && numero1 < numero2 && numero2 < numero3) {
            System.out.println(numero1 + " - " + numero2 + " - " + numero3);

        } else if (numero2 < numero1 && numero2 < numero3 && numero1 < numero3) {
            System.out.println(numero2 + " - " + numero1 + " - " + numero3);
        } else if (numero3 < numero1 && numero3 < numero2 && numero1 < numero2) {
            System.out.println(numero3 + " - " + numero1 + " - " + numero2);
        }else if(numero1>numero2 && numero1>numero3 && numero2>numero3){
            System.out.println(numero3 + " - " + numero2 + " - " + numero1);
        }

    }

}
