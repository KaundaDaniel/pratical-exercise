package Aula_Pratica_04;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        int A[]= {1,3,5,7,8,12,78,90,56,19};
        int soma=0;
        for (int i = 0; i < A.length; i++) {
            soma+=A[i]*A[i];
            
        }
        System.out.println("A soma dos quadrados do vecto é  "+ soma);
    }

}
