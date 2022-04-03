package Aula_Pratica_03;
import java.util.Scanner;
/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio12 {
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
    int numero;
        System.out.println("Entre com numero que deseja ver a tabuada");
        numero=read.nextInt();
        System.out.println("Tabuada dos " + numero);
        for(int i=1; i<=10; i++){
            System.out.println(numero + " X " +i+ " = " + numero*i);
        }
    }
}
