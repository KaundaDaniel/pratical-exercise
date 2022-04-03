package Aula_Pratica_03;

/* @author Kaúnda da Gama*/


public class Exercicio04 {

    public static void main(String[] args) {
      
        int popuA= 80000;
        int cont=0;
        int popuB= 200000;
        double taxaCrescB= 1.5;
        while(popuA<popuB){
        popuA=popuA+ (popuA/100)*3;
        popuB=(int) (popuB+(popuB/100) * 1.5);
        cont++;
        }
        System.out.println("Anos Necessário " + cont);
                
    }
}
