package Aula_Pratica_03;
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        int vector[]=new int[3];
        int numero;
        int mult=1;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite o numero");
            numero=ler.nextInt();
            vector[i]=numero;
            mult=mult*vector[i];
            
        }
        System.out.println(" resultado " + mult);
        
    }
  
}
