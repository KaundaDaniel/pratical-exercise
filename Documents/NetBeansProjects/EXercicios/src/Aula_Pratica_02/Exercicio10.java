package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String periodo;
        System.out.println("Em que período você estuda?");
        System.out.println("Digite: \n M-Matutino \n V-Mespertino \n N-Noturno");
        periodo = read.next();
        if (periodo == null) {
            System.out.println("Valor inválido");

        } else {
            switch (periodo) {
                case "M":
                case "m":
                    System.out.println("Bom dia");
                    break;
                case "V":
                case "v":
                    System.out.println("Boa Tarde");
                case "n":
                case"N":
                    System.out.println("Boa Noite");
                    break;
                default:
                    System.out.println("Periodo Inválido");
            }
        }

    }

}
