package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] kaunda) {
    Scanner read=new Scanner(System.in);
    double tempCels;
    double tempFahr;
        System.out.println("Insira a temperatura em Celsius");
        tempCels=read.nextDouble();
        tempFahr=tempCels*1.8+32;
        
        System.out.println("A temperartura em Fahrenheit é  " + tempFahr  );
    }

}
