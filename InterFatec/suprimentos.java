import java.util.Scanner;

public class suprimentos{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suprimento[] = new int [n];
        int positivo = 0;
        int saldo = 0;
        for(int i=0; i<n; i++){
            suprimento[i] = sc.nextInt();
            if(suprimento[i]>=0){
                positivo += suprimento[i];
            } 
            if(suprimento[i]<0){
                negativo += suprimento;
            }
        }
        if(negativo>positivo){
            negativo += positivo;
            saldo += negativo;
            saldo *= -1;
        } 
        System.out.println(saldo);
    }
}
