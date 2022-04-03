/*                      Até 5 Kg                 Acima de 5kg
o	File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
o	Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
o	Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar apenas um dos 
tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. 
Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre
o total da compra. Escreva um programa que peça o tipo e a quantidade de carne 
comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: 
tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
 */
package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String tipo;
        int quantidade;
        double preco = 0;
        String cartao = null;
        boolean controle = false;
        double desconto = 0;
        double precoTotal = 0;

        System.out.println("Insira o tipo de Carne que deseja Compras "
                + "\n 1- File Duplo \n 2- Alcatra \n 3- Picanha \n 4- Terminar \n -----------------------------");
        do {
            tipo = read.next();
            System.out.println("Insira a quantidade");
            if (tipo.equalsIgnoreCase("File Duplo") || tipo.equalsIgnoreCase("1")) {
                quantidade = read.nextInt();
                if (quantidade <= 5) {
                    preco = quantidade * 4.90;
                } else if (quantidade > 5) {
                    preco = quantidade * 5.80;
                }
                System.out.println("Como Deseja Pagar? \n 1- Cartão \n 2- Dinheiro");
                cartao = read.next();
                if (cartao.equalsIgnoreCase("1") || cartao.equalsIgnoreCase("Cartão")) {
                    desconto = (preco / 100) * 5;
                }

            } else if (tipo.equalsIgnoreCase("Alcatra") || tipo.equalsIgnoreCase("2")) {
                quantidade = read.nextInt();
                if (quantidade <= 5) {
                    preco = quantidade * 5.90;
                } else if (quantidade > 5) {
                    preco = quantidade * 6.80;
                }
                System.out.println("Como Deseja Pagar? \n 1- Cartão \n 2- Dinheiro");
                cartao = read.next();
                if (cartao.equalsIgnoreCase("2") || cartao.equalsIgnoreCase("Cartão")) {
                    desconto = (preco / 100) * 5;
                }

            } else if (tipo.equalsIgnoreCase("Picanha") || tipo.equalsIgnoreCase("3")) {
                quantidade = read.nextInt();
                if (quantidade <= 5) {
                    preco = quantidade * 6.90;
                } else if (quantidade > 5) {
                    preco = quantidade * 7.80;
                }
                System.out.println("Como Deseja Pagar? \n 1- Cartão \n 2- Dinheiro");
                cartao = read.next();
                if (cartao.equalsIgnoreCase("1") || cartao.equalsIgnoreCase("Cartão")) {
                    desconto = (preco / 100) * 5;
                }else if(cartao.equalsIgnoreCase("Dinheiro") || cartao.equalsIgnoreCase("2")){
                
                }

            }
        } while (!"4".equals(tipo));
        System.out.println("O tipo de Carne é " + tipo);
        System.out.println("O Preço tota a pagar é " + preco);
        System.out.println("O tipo de pagamento é " + cartao );
        System.out.println("O valor do desconto" + desconto);
        
    }
}
