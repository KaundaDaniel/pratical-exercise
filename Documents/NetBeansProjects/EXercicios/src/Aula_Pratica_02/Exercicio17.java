package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int ano;
        System.out.println("Entre com o ano");
        ano = read.nextInt();
        if (ano % 4 == 0) {
            System.out.println("Ano Bissexto");
        } else {
            System.out.println("Ano Comun");
        }
    }

}
