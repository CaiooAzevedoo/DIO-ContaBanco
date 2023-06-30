import java.util.Scanner;

public class ContaTerminal {
    int numeroDaConta;
    String agencia;
    String nome;
    String sobrenome;
    double saldo;
    // String nomeDoCliente = nome + sobrenome;
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência com dígito");
            String agencia = scanner.next();

            System.out.println("Agora, digite o número da sua conta");
            int numeroDaConta = scanner.nextInt();

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Informe o valor depositado");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");
        }
    
    }
}
