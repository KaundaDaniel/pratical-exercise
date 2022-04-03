package Aula_Pratica_02;

import java.util.Scanner;

public class vogais {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Didgite um letra");
        String letra= read.nextLine();
        
        switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("A letra digitada é uma Vogal");
                break;
            default:
                System.out.println("A letra Digita é uma consuante");
                     
        
        }
    }
    
}
