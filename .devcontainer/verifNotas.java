import java.util.Scanner;

public class verifNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valida = false;
        
        while (!valida) {
            System.out.println("Digite a nota do Aluno (0 a 10): ");
            double nota = sc.nextDouble(); 
            
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            } else {
                if (nota >= 7) {
                    System.out.println("Parabéns, você foi aprovado com nota: " + nota);
                } else if (nota >= 5) {
                    System.out.println("Você está de recuperação, sua nota foi: " + nota);
                } else {
                    System.out.println("Você foi reprovado, sua nota foi: " + nota);
                }
                valida = true;
            }
        }
        sc.close();
    }
}