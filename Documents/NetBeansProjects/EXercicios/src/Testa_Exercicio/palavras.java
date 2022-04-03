package Testa_Exercicio;

import java.util.Scanner;

public class palavras {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String carateres[] = new String[10];
        String letra;
        int cont = 0;
        for (int i = 0; i < carateres.length; i++) {
            System.out.println("Insira uma letra");
            letra = ler.next();
            carateres[i] = letra;

        }
        for (int i = 0; i < carateres.length; i++) {
            if (carateres[i].equalsIgnoreCase("u") || carateres[i].equalsIgnoreCase("a")
                    || carateres[i].equalsIgnoreCase("e") || carateres[i].equalsIgnoreCase("i")
                    || carateres[i].equalsIgnoreCase("o")) {

            } else {
                cont++;
            }
        }
        System.out.println(" ");
        for (String caratere : carateres) {
            System.out.print(" " + caratere);
        }
        System.out.println(" ");
        System.out.println("Numero de consoates " + cont);
    }
}
