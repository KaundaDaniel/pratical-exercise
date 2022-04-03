package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double lado1;
        double lado2;
        double lado3;
        double calcTriangulo;
        System.out.println("Entre com primeiro lado do Triângulo ");
        lado1=read.nextDouble();
        System.out.println("Entre com segundo lado do Triângulo ");
        lado2=read.nextDouble();
        System.out.println("Entre com terceiro lado do Triângulo ");
        lado3=read.nextDouble();
        if(lado1+lado2>lado3){
            System.out.println("Triângulo a Vista");
         if(lado1==lado2 && lado1==lado3 && lado2==lado3){
             System.out.println("Triângulo Equilátero");
         }else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
             System.out.println("Triângulo Isósceles");
         }else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
             System.out.println("Triângulo Escaleno");
         }
        }
        
    }
}
