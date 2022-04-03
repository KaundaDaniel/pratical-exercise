package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a;
        int b;
        int c;
        int delta;
        int x1;
        int x2;
                
        System.out.println("Entre com o valor de A");
        a = read.nextInt();
        if (a <= 0) {
            System.out.println("Valor de A = " + a + "  Impossível Calcular");
        }
        System.out.println("Entre com o valor de B");
        b = read.nextInt();
        System.out.println("Entre com o valor de C");
        c = read.nextInt();
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Valor de Delta = " + delta + "  Impossível Calcular");
        }else if(delta==0){
            System.out.println("A sua equação possui apenas uma raiz");
            x1=-b/2*a;
            System.out.println("O resultado é " + x1);
        }else{
        x1=(-b+(int)Math.sqrt(delta))/2*a;
        x2= (b-(int)Math.sqrt(delta))/2*a;
            System.out.println("O valor de X1 é " + x1);
            System.out.println("O valor de X2 é " + x2);
        }
        

    }

}
