package Aula_Pratica_01;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double salario;
        int horasTrabalho;
        double salarioBruto;
        double impostoRenda;
        double iNSS;
        double sindicato;
        double salarioLiquido;
        double descontosTotal;
        System.out.println("Quanto ganha por horas?");
        salario = read.nextDouble();
        System.out.println("Quantas horas Trabalha?");
        horasTrabalho = read.nextInt();
        salarioBruto = salario * horasTrabalho;
        impostoRenda = ((salarioBruto / 100) * 11);
        iNSS = ((salarioBruto / 100) * 8);
        sindicato = ((salarioBruto / 10) * 5);
        descontosTotal=impostoRenda+iNSS+sindicato;
        salarioLiquido = salarioBruto-descontosTotal;
        System.out.println("O salário bruto é " + salarioBruto);
        System.out.println("Voce  pagou ao INSS o valor de: " + iNSS);
        System.out.println("Voce pagou ao sindicato o valor de " + sindicato);
        System.out.println("O seu salario Liquido é " + salarioLiquido);

    }

}
