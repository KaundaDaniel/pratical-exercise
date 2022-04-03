package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    int numero1;
    int numero2;
        System.out.println("Insira o primeiro número");
        numero1=read.nextInt();
        System.out.println("Insira o segundo número");
        numero2=read.nextInt();
        if( numero1>numero2){
            System.out.println("O número " + numero1 + " é maior");
        }else{
            System.out.println("O número " + numero2 + " é maior");
        }
        
    }

}
