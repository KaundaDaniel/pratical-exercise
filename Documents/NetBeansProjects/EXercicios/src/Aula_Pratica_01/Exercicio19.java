
package Aula_Pratica_01;

import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int numero;
        System.out.println("Digite um número");
        numero=ler.nextInt();
        int antecessor= numero-1;
        int sucessor= numero+1;
        System.out.println("O Antecessor do número é " + antecessor);
        System.out.println("O Sucessor do número é " + sucessor);
    }
}
