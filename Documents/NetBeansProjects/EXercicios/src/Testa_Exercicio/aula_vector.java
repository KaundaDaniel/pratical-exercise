package Testa_Exercicio;

public class aula_vector {
    public static void main(String[] args) {
        
        int notas[][]= {{13,42,45}, {21,35,12},{34,54,32}};
        
        System.out.println(" Numeros");
        for (int i = 0; i <notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(" " + notas[i][j]);
                
            }
            System.out.println(" ");
            
        }
        
    }
    
}
