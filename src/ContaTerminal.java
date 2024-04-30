import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int numero_da_conta;
        String numero_da_agencia, nome_do_cliente;
        double saldo_bancario;

        System.out.println("Olá, seja Bem Vindo ao Nosso banco");
        System.out.println("Para reslização do procedimento de abertura de sua conta vamos precisar que o Sr.(a) responda algumas perguntas e preencha os dados bancários.");

        System.out.println("Por favor, digite um número que deseja ser da sua conta (ATENÇÃO, ele deve conter apenas 4 dígitos): ");
        numero_da_conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Agora, digite um número para sua agência: ");
        numero_da_agencia = scanner.nextLine();

        System.out.println("Digite seu nome completo: ");
        nome_do_cliente = scanner.nextLine();

        System.out.println("Com quanto de saldo bancário que você deseja começar? ");
        saldo_bancario = scanner.nextDouble();

        System.out.println("Muito Obrigada Sr.(a) " + nome_do_cliente + ", por abrir sua conta conosco." );
        System.out.println("O número da sua conta é " + numero_da_conta + ", sua Agência é "+ numero_da_agencia + " e o seu saldo é de: R$ "+ saldo_bancario + " Reais.");


    }
}
