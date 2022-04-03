package Aula_Pratica_03;
import java.util.Scanner;
/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int numero;
        int cont=0;
       
        for(int i=1; i<=5; i++){
            System.out.println("Digite o numero");
            numero=read.nextInt();
            cont+=numero;
        }
        
        System.out.println("A soma de todos numero é " + cont);
        System.out.println("A media é " + cont/5);
    }
}
