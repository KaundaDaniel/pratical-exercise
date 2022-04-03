package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        double litros;
        String tipo;
        double precoGasolina=2.5;
        double precoAlcool=1.90;
        double valorPagar;
        double desconto=0.0;
        
        System.out.println("Entre com a quantidade de combustivel vendido");
        litros=read.nextDouble();
        System.out.println("Entre com tipo de Conbustivel: \n A- Álcool \n G- Gasolina");
        tipo=read.next();
        if(tipo.equalsIgnoreCase("a") && litros<=20){
        valorPagar=precoAlcool*litros;
        desconto=(valorPagar/100)*3;
        }else if(tipo.equalsIgnoreCase("a") && litros>20){
        valorPagar=precoAlcool*litros;
        desconto=(valorPagar/100)*5;
        }else if(tipo.equalsIgnoreCase("g") && litros<=20){
            valorPagar=precoGasolina*litros;
            desconto=(valorPagar/100)*4;
        }else if(tipo.equalsIgnoreCase("g") && litros>20){
        valorPagar=precoGasolina*litros;
        desconto=(valorPagar/100)*6;
        }
        System.out.println("O valor a ser pago pela " +tipo+ " com o desconto é " + desconto);
        
        
        
        
        
    
    }

}
