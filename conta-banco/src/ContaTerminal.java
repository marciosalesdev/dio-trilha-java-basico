import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        conta.numero = scanner.nextInt();

        scanner.nextLine(); // consume the newline left-over

        System.out.print("Por favor, digite a agência (formato 000-0): ");
        conta.agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        conta.nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        conta.saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
                conta.nomeCliente, conta.agencia, conta.numero, conta.saldo);

        scanner.close();
    }
}