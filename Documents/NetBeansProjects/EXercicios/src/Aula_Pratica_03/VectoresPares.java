package Aula_Pratica_03;
import java.util.Scanner;

/**
 *
 * @author Kaúnda da Gama
 */
public class VectoresPares {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeros[] = new int[10];
        int pares[] = new int[10];
        int impares[] = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero");
            numeros[i] = ler.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
            } else {
                impares[i] = numeros[i];
            }

        }
        System.out.println("Vectores dos numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("-" + numeros[i]);
        }
        System.out.println(" ");
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] != 0) {
                System.out.print("-" + pares[i]);
            }

        }
        System.out.println(" ");
        System.out.println("Imapres ");
        for (int i = 0; i < impares.length; i++) {
            if (impares[i] != 0) {
                System.out.print("-" + impares[i]);
            }
        }
        System.out.println(" ");
    }

}
