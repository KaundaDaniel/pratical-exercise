package Aula_Pratica_02;

import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[]args){
    Scanner read=new Scanner(System.in);
    int dia;
    int mes;
    int ano;
        System.out.println("um dia");
        dia=read.nextInt();
        System.out.println("Insira um mes");
        mes=read.nextInt();
        System.out.println("Insira um ano");
        ano=read.nextInt();
        if(dia<=31&& mes<=12 && ano>=1500){
            System.out.println("Data válida:\n " + dia+"\\" +mes+"\\" + ano);
        }else{
            System.out.println("Data inválida");
        }
        
    }
    
    
}
