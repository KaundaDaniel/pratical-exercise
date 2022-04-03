package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] kaunda) {
        Scanner read = new Scanner(System.in);
        double salarioHora;
        int horasTrabalho;
        double inss;
        double fgts;
        double iR;
        double totalDescontos;
        double salarioBruto;
        double salarioLiquido;
        System.out.println("Inisira quantas horas Trabalha por mês");
        horasTrabalho = read.nextInt();
        System.out.println("Insira quanto ganha por Hora");
        salarioHora = read.nextDouble();
        salarioBruto = horasTrabalho * salarioHora;
        if (salarioBruto > 900.00 && salarioBruto <= 1500.00) {
            iR = (salarioBruto / 100) * 5;
            inss = (salarioBruto / 100) * 10;
            fgts = (salarioBruto / 100) * 11;
            totalDescontos = iR + inss;
            salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("O seu salário Liquído " + salarioLiquido);
        } else if (salarioBruto > 1500.00 && salarioBruto <= 2500.00) {
            iR = (salarioBruto / 100) * 10;
            inss = (salarioBruto / 100) * 10;
            fgts = (salarioBruto / 100) * 11;
            totalDescontos = iR + inss + fgts;
            salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("O seu salário Liquído " + salarioLiquido);
        } else if (salarioBruto > 2500.00) {
            iR = (salarioBruto / 100) * 20;
            inss = (salarioBruto / 100) * 10;
            fgts = (salarioBruto / 100) * 11;
            totalDescontos = iR + inss + fgts;
            salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("O seu salário Liquído " + salarioLiquido);
        
        }else{
            System.out.println("O seu salário está isento de descontos" + salarioBruto);
        }

    }
}
