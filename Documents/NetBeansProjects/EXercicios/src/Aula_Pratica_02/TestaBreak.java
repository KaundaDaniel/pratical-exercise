package Aula_Pratica_02;

import java.util.Scanner;

public class TestaBreak {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Entre com um número");
            int numero = new Scanner(System.in).nextInt();
            if (numero == 0) {
                System.out.println("Programa Terminado com sucesso");
                break;
            }
        }
    }

}
