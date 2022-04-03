package Aula_Pratica_04;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int A[] = {19, 11, 10, 13, 15, 13, 32, 15, 56, 67};
        int B[] = {12, 71, 15, 17, 54, 89, 11, 15, 13, 45};
        int c[] = new int[20];
        int cont=0;
        for (int i = 0; i < A.length; i++) {
            c[cont]=A[i];
            cont++;
            c[cont]=B[i];
            cont++;
            
        }
        for (int k : c) {
            System.out.print(" "+k);
            
        }
        

    }

}
