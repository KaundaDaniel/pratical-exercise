package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double produto1, produto2, produto3;
        System.out.println("Insira o preço do primeiro produto");
        produto1 = read.nextDouble();
        System.out.println("Insira o preço do segundo produto");
        produto2 = read.nextDouble();
        System.out.println("Insira o preço do terceiro produto");
        produto3 = read.nextDouble();
        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("Comprar primeiro o produto");

        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("Comprar segundo o produto");
        } else if (produto3 < produto2 && produto3 < produto1) {
            System.out.println("Comprar segundo o produto");
        }
    }

}
