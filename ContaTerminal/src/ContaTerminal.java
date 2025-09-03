import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia = "";   
        String nomeCliente = "";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da sua agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da sua conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da sua conta (use ponto para separar os centavos): ");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
