package Aula_Pratica_02;

import java.util.Scanner;

public class TestaWhile {
    public static void main(String[] args) {
        boolean testa= false;
        while(testa==false){
            System.out.println("Entre um numero");
        int u= new Scanner(System.in).nextInt();
        if(u%2==0){
            System.out.println("Numero par");
            System.out.println("------------------");
        }else{
            System.out.println("Numero impar");
            testa=true;
        }
        }
    }
    
}
