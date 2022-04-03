package Aula_Pratica_03;

import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int numeros[] = new int[5];
        int numero;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero");
            numero=ler.nextInt();
            numeros[i]=numero; 
        }
        for(int lerVector:numeros){
            System.out.println("Os numeros digitados é "+ lerVector);
        }
        
            
            for (int i = numeros.length-1; i>=0 ; i--) {
            System.out.println("Os Numeros " + numeros[i]);
        }
        

    }
}
