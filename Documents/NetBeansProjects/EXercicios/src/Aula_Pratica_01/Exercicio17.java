package Aula_Pratica_01;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int soma;
        System.out.println("Digite o primeiro número");
        numero1=ler.nextInt();
        System.out.println("Digite o segundo número");
        numero2=ler.nextInt();
        System.out.println("Digite o terceiro núumero");
        numero3=ler.nextInt();
        soma=numero1+numero2+numero3;
        System.out.println("A soma dos número é " +soma);
      
        
        
    }
    
}
