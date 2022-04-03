
package Aula_Pratica_03;

import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class vectorPares {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int vector []= new int[10];
        int numero;
        for (int i = 0; i <= vector.length; i++) {
            System.out.println("Digite o numero");
            numero=ler.nextInt();
            if (numero%2==0) {
                vector[i]=numero;
            }else{
            vector[i]=1;
            }
            
        }
        System.out.print("Vector");
        for (int imprimir:vector) {
            System.out.print(" " +imprimir);
        }
    }
    
}
