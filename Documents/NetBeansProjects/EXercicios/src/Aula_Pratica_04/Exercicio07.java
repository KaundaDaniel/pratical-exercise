package Aula_Pratica_04;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int B[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int C[] = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int D[] = new int[30];
        int cont = 0;
        for (int i = 0; i < A.length; i++) {
            D[cont] = A[i];
            cont++;
            D[cont] = B[i];
            cont++;
            D[cont] = C[i];
            cont++;

        }
        for (int i : D) {
            System.out.print("-" +i);
            
        }
        System.out.println(" ");
    }

}
