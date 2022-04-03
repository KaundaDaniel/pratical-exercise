package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String letra;
        System.out.println("Entre uma letra ");
        letra = read.next();
        switch (letra) {
            case "A":
            case "a":
                System.out.println("A letra digita é uma vogal");
                break;
            case "e":
            case "E":
                System.out.println("A letra digita é uma vogal");
                break;
            case "i":
            case "I":
                System.out.println("A letra digita é uma vogal");
                break;
            case "o":
            case "O":
                System.out.println("A letra digita é uma vogal");
                break;
            case " U":
            case "u":
                System.out.println("A letra digita é uma vogal");
                break;
            default:
                System.out.println("A letra digitada é uma consoante");

        }
    }

}
