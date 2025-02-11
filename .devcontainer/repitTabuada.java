import java.util.Scanner;

public class repitTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valida = false;
        
        while (!valida) {
            System.out.println("Digite um número (de 0 a 10) para a sua tabuada: ");
            int num = sc.nextInt(); 
            
            if (num < 0 || num > 10) {
                System.out.println("Número inválido");
            }  else {
                System.out.println("Sua tabuada do número: "+num);
                for(int i=1;i<=10;i++){
                    System.out.println(i+"°: "+num*i);
                }
                         
                valida = true;
            }
        } sc.close();
    }
}