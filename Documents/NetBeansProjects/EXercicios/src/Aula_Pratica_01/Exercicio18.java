
package Aula_Pratica_01;

import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double media= (8.9+7)/2;
        double media2= (4.5+6)/2;
        double somaMedias= media+media2;
        double mediaDasMedias=(media+media2+somaMedias)/3;
        System.out.println("A Primeira media é " + media);
        System.out.println("A Segunda media é " + media2);
        System.out.println("A das medias media é " + somaMedias);
        System.out.println("A soma das medias é " +mediaDasMedias);
        
    }
    
}
