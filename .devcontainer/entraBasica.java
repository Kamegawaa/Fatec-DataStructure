import java.util.Scanner;

public class entraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valida = false;
        String nome = "";
        int idade = 0;
        double altura = 0.0;

        while (!valida) {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();

            if (nome.matches(".*\\d.*")) {
                System.out.println("Nome não pode conter números. Digite novamente.");
                continue;
            } 

            System.out.println("Nome validado");

            System.out.println("Digite sua idade: ");
            while (!sc.hasNextInt()) { 
                System.out.println("Idade inválida. Digite um número inteiro válido.");
                sc.next();
            }
            idade = sc.nextInt();
            sc.nextLine(); 

            if (idade < 0) {
                System.out.println("Idade não pode ser menor que 0. Digite novamente.");
                continue;
            } 

            System.out.println("Idade validada");

            System.out.println("Digite sua altura (em metros, exemplo: 1.75): ");
            while (!sc.hasNextDouble()) {
                System.out.println("Altura inválida. Digite um número válido.");
                sc.next(); 
            }
            altura = sc.nextDouble();
            sc.nextLine(); 

            if (altura < 0) {
                System.out.println("Altura não pode ser menor que 0. Digite novamente.");
                continue;
            } 

            System.out.println("Altura validada");
            valida = true;
        }

        System.out.println("==============");
        System.out.println("Sua ficha é: \nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
        System.out.println("==============");

        sc.close();
    }
}