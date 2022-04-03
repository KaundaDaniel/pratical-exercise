package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String resposta1;
        String resposta2;
        String resposta3;
        String resposta4;
        String resposta5;
        String nome;

        int cont = 0;
        System.out.println("Qual é o seu nome?");
        nome=read.next();
        System.out.println("Telefonou para a vítima?");
        resposta1 = read.next();
        if (resposta1.equalsIgnoreCase("sim")) {
            cont++;
        }
        System.out.println("Esteve no local do crime?");
        resposta2 = read.next();
        if (resposta2.equalsIgnoreCase("sim")) {
            cont++;
        }
        System.out.println("Mora perto da vítima?");
        resposta3 = read.next();
        if (resposta3.equalsIgnoreCase("sim")) {
            cont++;
        }
        System.out.println("Devia para a vítima?");
        resposta4 = read.next();
        if (resposta4.equalsIgnoreCase("sim")) {
            cont++;
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta5 = read.next();
        if (resposta5.equalsIgnoreCase("sim")) {
            cont++;
        }
        switch (cont) {
            case 2:
                System.out.println(nome +" é SUSPEITA");
                break;
            case 3:
            case 4:
                System.out.println(nome +" é CÚMPLICE");
                break;
            case 5:
                System.out.println(nome +" é ASSASSINO");
                break;
            default:
                System.out.println(nome +" é INOCENTE");
                break;

        }
    }

}
