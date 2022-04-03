package Aula_Pratica_02;

/*
o	                      Até 5 Kg           Acima de 5 Kg
o	Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
o	Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) 
de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.




 */
import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tipoFruta;
        int quantidadeMorango = 0;
        int quantidadeMaca = 0;
        int quantidadeTotal;
        double precoMaca = 0;
        double precoMorango = 0;
        double precoTotal = 0;
        String tipoFruta2;
        double desconto;

        System.out.println("Entre com tipo de fruta que deseja comprar: \n 1- Morango \n 2- Maçã \n 3- Terminar");
        do {
            tipoFruta = read.nextInt();
            if (tipoFruta == 1) {
                System.out.println("Insira a Quantidade de Morango");
                quantidadeMorango = read.nextInt();
                if (quantidadeMorango > 5) {
                    precoMorango = quantidadeMorango * 2.20;
                } else if (quantidadeMorango <= 5) {
                    precoMorango = quantidadeMorango * 2.50;
                }
            } else if (tipoFruta == 2) {
                System.out.println("Informe a quantidade de Maçã");
                quantidadeMaca = read.nextInt();
                if (quantidadeMaca > 5) {
                    precoMaca = quantidadeMaca * 1.50;
                } else if (quantidadeMaca <= 5) {
                    precoMaca = quantidadeMaca * 1.80;
                }
            }
            quantidadeTotal = quantidadeMorango + quantidadeMaca;
            precoTotal = precoMaca + precoMorango;
            if (quantidadeTotal > 8 || precoTotal > 25.00) {
                desconto = (precoTotal / 100) * 10;
                precoTotal = precoTotal - desconto;

            }

            System.out.println("Entre com tipo de fruta que deseja comprar: \n 1- Morango \n 2- Maçã \n 3- Terminar");

        } while (3 != tipoFruta);

        System.out.println("O Preço tota a pagar é " + precoTotal);

    }

}
