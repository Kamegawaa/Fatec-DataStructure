import java.util.Scanner;

public class suprimentos{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suprimento[] = new int [n];
        int positivo = 0;
        int negativo = 0;
        int saldo = 0;
        for(int i=0; i<n; i++){
            suprimento[i] = sc.nextInt();
            if(suprimento[i]>=0){
                positivo += suprimento[i];
            } 
            if(suprimento[i]<0){
                negativo += suprimento[i];
            }
        }
        if(negativo<positivo){
            negativo += positivo;
            if(negativo<0){
                saldo += negativo;
                saldo *= -1;
            }
        } 
        System.out.println(saldo);
    }
}
