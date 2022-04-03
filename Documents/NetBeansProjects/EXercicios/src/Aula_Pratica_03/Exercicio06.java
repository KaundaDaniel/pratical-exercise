package Aula_Pratica_03;

import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio06 {

    public static void main(String[] args) {
        int numero[] = new int[5];
        Scanner ler=new Scanner(System.in);
        int soma=0;
        int multiplica=1;
        for (int i = 0; i<numero.length; i++) {
            System.out.println("Digite um numero");
            numero[i]=ler.nextInt();
            soma+=numero[i];
            multiplica*=numero[i];
        }
        for(int i=0; i<numero.length; i++){
            System.out.print(" " + numero[i]);
        }System.out.println(" ");
        System.out.println("Mulplicação " + soma);
        System.out.println("Mulplicação " + multiplica);
    }

}
