package Aula_Pratica_03;
import java.util.Scanner;
/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int numero;
        int contPar=0;
        int contImpar=0;
        int contador=0;
        while(contador<=10){
            System.out.println("Digite um numero");
            numero=read.nextInt();
            if(numero%2==0){
            contPar++;
            }else{
            contImpar++;
            }
            contador++;
        }
        System.out.println("Números Pares " + contPar);
        System.out.println("Números Impares " + contImpar);
    }
}
