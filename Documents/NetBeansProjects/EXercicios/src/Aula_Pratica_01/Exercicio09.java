package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double valorHora;
        int horasTrabalho;
        double resultado;
        System.out.println("Entre com o valor que ganha por horas");
        valorHora = read.nextDouble();
        System.out.println("Entre com as horas trabalhadas");
        horasTrabalho = read.nextInt();
        resultado = valorHora * horasTrabalho;
        System.out.println("O valor a ganhar no Mês é " + resultado);

    }

}
