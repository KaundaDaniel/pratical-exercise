package Aula_Pratica_03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        boolean parada = false;
        do {
            System.out.println("Digite o seu Nome");
            nome = read.next();
            if (nome.length() < 3) {
                System.out.println("O nome precisa ter 3 letras");
            } else {
                parada = true;
            }
        } while (!parada);

        parada = false;

        do {
            System.out.println("Digite a sua idade");
            idade = read.nextInt();
            if (idade > 0 && idade <= 150) {
                parada = true;
            } else {
                System.out.println("Idade inválida! \n Digite idade compriendidade entre 0 e 150");
                parada = false;
            }
        } while (!parada);

        parada = false;
        do {
            System.out.println("Digite o seu salario");
            salario = read.nextDouble();
            if (salario > 0) {
                parada = true;
            } else {
                System.out.println("Salário inválido! \n Digite um salário Válido!");
                parada = false;
            }

        } while (!parada);

        parada = false;
        do {
            System.out.println(" Digite o seu sexo \n M- Masculino \n F-Femenino");
            //sexo=read.next().charAt(0);
            sexo = read.next();
            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {

                parada = true;
            } else {
                System.out.println("Sexo Inválido!");
                parada = false;
            }

        } while (!parada);
        parada = false;

        do {
            System.out.println("Digite o seu Civil \n S- Solteiro \n C-Casado \n D-Divorciado \n V-Viúvo");
            //sexo=read.next().charAt(0);
            estadoCivil = read.next();
            if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C")
                    || estadoCivil.equalsIgnoreCase("D") || estadoCivil.equalsIgnoreCase("V")) {
                parada = true;
            } else {
                System.out.println("Estado Civil Inválido!");
                parada = false;
            }

        } while (!parada);
        
        
        System.out.println("------Dados Inseridos------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: "+ salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil:" + estadoCivil);
        
    }

}
