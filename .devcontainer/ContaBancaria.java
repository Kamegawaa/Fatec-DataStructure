import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("ERRO: Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja realizar um saque? (S/N)");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("Sim")) {
                System.out.println("Digite um valor para sacar: ");
                valor = sc.nextDouble();
                sc.nextLine(); 

                if (valor <= 0) {
                    System.out.println("ERRO: Valor de saque inválido.");
                } else if (valor > saldo) {
                    System.out.println("ERRO: Saldo insuficiente para saque.");
                    continuar = false;
                } else {
                    saldo -= valor;
                    System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
                }
            } else {
                continuar = false;
            }
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String exibirDadosConta() {
        return "Titular: " + titular + "\nConta: " + numeroConta + "\nSaldo: R$ " + String.format("%.2f", saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Lucas Kame", "123455-7");

        System.out.print("Digite um valor para depositar: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        conta.sacar(0);

        System.out.println("\nSaldo atual: R$ " + String.format("%.2f", conta.consultarSaldo()));
        System.out.println("\nDados da conta:\n" + conta.exibirDadosConta());

        sc.close();
    }
}
