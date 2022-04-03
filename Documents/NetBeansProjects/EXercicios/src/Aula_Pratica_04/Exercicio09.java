package Aula_Pratica_04;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String perguntas[] = new String[6];
        int cont = 0;

        System.out.println("Telefonou para a vítima?");
        perguntas[cont] = read.nextLine();
        cont++;
        System.out.println("Esteve no local do crime?");
        perguntas[cont] = read.nextLine();
        cont++;
        System.out.println("Mora perto da vítima?");
        perguntas[cont] = read.nextLine();
        cont++;
        System.out.println("Devia para a vítima?");
        perguntas[cont] = read.next();
        cont++;
        System.out.println("Já trabalhou com a vítima?");
        perguntas[cont] = read.nextLine();
        cont++;
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            
        }
    }

}
