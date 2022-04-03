package Aula_Pratica_04;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        int idade[] = {13, 34, 20, 32, 65, 10, 24, 32, 30, 13, 14, 15, 16, 11, 12, 19};//new int[30];
        double altura[] = {1.90, 1.7, 1.6, 1.4, 1.3, 1.6, 1.4, 1.2, 1.1, 1.2, 1.7, 1.3, 1.3, 1.4, 1.2, 1.3}; //new double[30];
        double media = 0;
        int contAluno = 0;
        for (int i = 0; i < idade.length; i++) {
            media += altura[i];
        }
        media /= altura.length;
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > 13 && altura[i] < media) {
                contAluno++;
            }

        }

        for (double d : altura) {
            System.out.println(" " + d);

        }
        System.out.println("Números de Alunos que tem altura inferior "+ contAluno);
        System.out.println("Media: " + media);

    }

}
