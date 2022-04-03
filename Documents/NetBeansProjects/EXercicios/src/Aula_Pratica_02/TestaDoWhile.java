
package Aula_Pratica_02;

import java.util.Scanner;


public class TestaDoWhile {
    public static void main(String[] args) {
        int numero;
        System.out.println("Digite um número");
        do{
        numero= new Scanner(System.in).nextInt();
            System.out.println("Digite outro número ou  1000 para terminar");
        }while(numero!=1000);
    }
}
