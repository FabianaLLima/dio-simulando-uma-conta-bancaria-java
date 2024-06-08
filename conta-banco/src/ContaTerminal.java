import java.util.Scanner;

public class ContaTerminal { 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o número da sua conta");
        int numeroDaConta = scanner.nextInt();
        
        System.out.println("Digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Quanto você quer depositar hoje?");
        double saldo = scanner.nextFloat();
        
        System.out.println("Olá, " + nomeCliente + " seja bem-vindo(a)! Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta; " + numeroDaConta + " Seu saldo atual é: " + saldo + "");
   }
}
    
