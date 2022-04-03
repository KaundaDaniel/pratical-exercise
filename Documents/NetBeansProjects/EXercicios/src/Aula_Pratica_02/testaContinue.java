package Aula_Pratica_02;


public class testaContinue {
    public static void main(String[] args) {
        for(int k=0; k<1000; k++){
        if(k%2==0){
            continue;
        }
            System.out.println(k);
        }
    }
    
}
