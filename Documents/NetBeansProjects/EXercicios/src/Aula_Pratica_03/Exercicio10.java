package Aula_Pratica_03;

import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Digite o primero numero");
        numero1=read.nextInt();
        System.out.println("Digite o segundo numero");
        numero2=read.nextInt();
        System.out.println("Os Numeros que estão no intervalo são");
        for(int i=numero1; i<=numero2; i++){
            System.out.println(i);
        }
    }

}
