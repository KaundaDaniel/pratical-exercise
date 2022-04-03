package Aula_Pratica_03;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int nota;
        boolean parada=false;
        do{
        System.out.println("Entre com uma nota");
        nota=read.nextInt();
        if(nota>0 && nota<=10){
            System.out.println("Nota Válida");
            parada=true;
        }else{
            System.out.println("Nota Inválida");
        }
        } while(!parada);
        
        
       
    }

}
