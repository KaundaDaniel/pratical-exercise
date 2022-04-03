package Aula_Pratica_03;
import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String nomeUsuario;
        String senhaUsuario;
        boolean parada=false;
        do{
            System.out.println("Digite o nome do Usuário");
            nomeUsuario=read.next();
            System.out.println("Digite a sua senha");
            senhaUsuario=read.next();
            if(nomeUsuario.equalsIgnoreCase(senhaUsuario)){
                System.out.println("Senha deve ser diferente do nome do Usuário");
            }else{
                System.out.println("Usuario Aceite com sucesso!");
                parada=true;
            }
        }while(!parada);
    }
}
