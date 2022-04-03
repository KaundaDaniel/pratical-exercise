package Aula_Pratica_03;

import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int base;
        int potencia;
        int resultado=0;
        System.out.println("Digite a Base da potencia");
        base=read.nextInt();
        System.out.println("Digite a Potencia");
        potencia=read.nextInt();
       resultado=base;
        for (int i = 1; i < potencia; i++) {
            resultado*=base;
            
        }
        System.out.println(resultado);
    }
}
