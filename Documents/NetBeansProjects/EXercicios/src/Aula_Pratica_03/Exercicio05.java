package Aula_Pratica_03;

import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int popuA;
        int popuB;
        int cont=0;
        double cresciA;
        double cresciB;
        System.out.println("Digite o numero da populção A");
        popuA=read.nextInt();
        System.out.println("Digite a taxa de Crescimento da populção A");
        cresciA=read.nextDouble();
        System.out.println("Digite o numero da populção B");
        popuB=read.nextInt();
        System.out.println("Digite a taxa de Crescimento da populção B");
        cresciB=read.nextDouble();
        while(popuA<popuB){
        popuA+=(popuA/100)*cresciA;
        popuB+=(popuB/100)/cresciB;
        cont++;
        }
        System.out.println("Anos Necessário: " + cont);
        
        
        
    }
}
