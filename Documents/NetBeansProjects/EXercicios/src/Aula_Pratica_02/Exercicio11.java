package Aula_Pratica_02;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double salario;
        double aumento;
        double percentual;
        double novoSalario;
        System.out.println("Entre com o seu salário");
        salario = read.nextDouble();
        if (salario <= 280.00) {
            percentual = (salario / 100) * 20;

            System.out.println("O seu salário antes do reajuste é " + salario);
            System.out.println("Vai receber um aumento de 20%");
            System.out.println("Que corresponde a " + percentual);
            novoSalario = percentual + salario;
            System.out.println("O seu salário com o aumento é " + novoSalario);

        } else if (700.00 > salario && salario > 280.00) {
            percentual = (salario / 100) * 15;
            System.out.println("O seu salário é de " + salario);
            System.out.println("Vai receber um aumento de 15%");
            System.out.println("Que corresponde a " + percentual + " do seu salário");
            novoSalario = percentual + salario;
            System.out.println("O seu salário com o aumento é " + novoSalario);
        }else if(salario>700.00 && salario<1500.00){
            percentual = (salario / 100) * 10;
            System.out.println("O seu salário é de " + salario);
            System.out.println("Vai receber um aumento de 10%");
            System.out.println("Que corresponde a " + percentual + " do seu salário");
            novoSalario = percentual + salario;
            System.out.println("O seu salário com o aumento é " + novoSalario);
        
        } else if(salario>1500.00){
        percentual = (salario / 100) * 5;
            System.out.println("O seu salário é de " + salario);
            System.out.println("Vai receber um aumento de 5%");
            System.out.println("Que corresponde a " + percentual + " do seu salário");
            novoSalario = percentual + salario;
            System.out.println("O seu salário com o aumento é " + novoSalario);
        }
    }

}
