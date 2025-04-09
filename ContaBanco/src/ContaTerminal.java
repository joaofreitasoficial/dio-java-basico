import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Criação do objeto Scanner para receber dados do usuário
        Scanner leitor = new Scanner(System.in);
        
        // Solicitação e leitura dos dados
        System.out.println("Por favor, digite o número da Agência:");
        agencia = leitor.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        numero = leitor.nextInt();
        
        // Consumir a quebra de linha pendente
        leitor.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = leitor.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        saldo = leitor.nextDouble();
        
        // Exibição da mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechar o scanner
        leitor.close();
    }
}
