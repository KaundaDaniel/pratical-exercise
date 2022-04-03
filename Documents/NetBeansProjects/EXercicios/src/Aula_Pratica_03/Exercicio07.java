package Aula_Pratica_03;

import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio07 {

    public static void main(String[] kaunda) {
        Scanner read=new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int numero;
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite um numero");
            numero=read.nextInt();
            if(numero>maior){
            maior=numero;
            }
            
        }
        System.out.println("O maior Numero digitado foi " + maior );
    }
}
