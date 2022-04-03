package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        double area;
        double calcArea;
        Scanner read = new Scanner(System.in);
        System.out.println("Insira a área do Circulo");
        area = read.nextDouble();
        calcArea = Math.PI * Math.pow(area, 2);
        System.out.println("A área do Circulo é " + calcArea + " m");

    }

}
