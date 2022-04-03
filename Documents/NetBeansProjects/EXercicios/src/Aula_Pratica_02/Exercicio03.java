package Aula_Pratica_02;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] kaunda) throws IOException {
        Scanner read = new Scanner(System.in);
        String sexo;
        System.out.println("Insira F de femenino ou M de Masculino");
        sexo = read.next();
        if (sexo == null) {
            System.out.println("Sexo inválido");
        } else {
            switch (sexo) {
                case "m":
                case "M":
                    System.out.println("Sexo Masculino");
                    break;
                case "F":
                case "f":
                    System.out.println("Sexo Femenino");
                    break;
                default:
                    System.out.println("Sexo Inválido");

            }
        }
    }

}
