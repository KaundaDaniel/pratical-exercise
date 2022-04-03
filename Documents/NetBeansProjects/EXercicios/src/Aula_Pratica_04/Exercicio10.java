package Aula_Pratica_04;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        double tempAno[]=new double[12];
        String mesAno[]={"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembo", "Outubro", "Novembro", "Dezembro"};
        double media=0;
        for (int i = 0; i < tempAno.length; i++) {
            System.out.println("Insira a temperatura de "+ mesAno[i]);
            tempAno[i]=ler.nextDouble();
            media+=tempAno[i];
            
        }
        media/=tempAno.length;
        for (int i = 0; i < tempAno.length; i++) {
            if (tempAno[i]>media) {
                System.out.println(i+"- "+ mesAno[i]+ " = " + tempAno[i]);
            }
            
        }
        
    }

}
