package Aula_Pratica_03;
import java.util.Scanner;
/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int base;
        int expoente;
        int cont=1;
        System.out.println("Insira a base");
        base=ler.nextInt();
        System.out.println("Insira o expoente");
        expoente=ler.nextInt();
        for (int i = 1; i <= expoente; i++) {
            cont*=base;
            
        }
        System.out.println(cont);
    }
}
