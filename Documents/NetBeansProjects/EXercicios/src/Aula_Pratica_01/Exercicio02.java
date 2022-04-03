package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double base;
        double expoente;
        double resultado;
        System.out.println("Introduza a base");
        base=ler.nextDouble();
        System.out.println("Introduza o expoente");
        expoente=ler.nextDouble();
        resultado=Math.pow(base,expoente);
        System.out.println(resultado);
        
        
    }

}
