package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int diaSemana;
        System.out.println("Entre com: \n 1- Domingo \n 2- Segunda \n 3- Terça \n 4- Quarta \n 5- Quinta \n 6- Sexta \n 7- Sabádo");
        diaSemana = read.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabádo");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }

}
