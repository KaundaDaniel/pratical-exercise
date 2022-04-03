package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] kaunda) {
        double tempFah;
        double tempCels;
        Scanner read=new Scanner(System.in);
        System.out.println("Entre com a temperatura em Fahrenheit");
        tempFah=read.nextDouble();
        tempCels=5*((tempFah-32)/9);
        System.out.println("A temperatura em graus Celsius é " + tempCels);
    }

}
