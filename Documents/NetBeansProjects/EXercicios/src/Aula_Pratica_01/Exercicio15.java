package Aula_Pratica_01;
import java.util.Scanner;
public class Exercicio15 {

    public static void main(String[] kaunda) {
        Scanner read=new Scanner(System.in);
        double peso;
        double multa;
        double excesso;
        System.out.println("Insira o peso da sua mercadoria");
        peso=read.nextDouble();
        excesso=peso-50;
        multa=excesso*4.00;
        System.out.println("O seu peso em excesso é "+ excesso);
        System.out.println("Vai pagar a multa de " + multa);
        
    }
}
