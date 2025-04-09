import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("digite o numero da conta");
        int conta = scan.nextInt();
        scan.nextLine(); // Limpa o buffer do scanner para garantir que o comando nextLine funcione corretamente após usar o comando nexInt ou nextDouble
    
        System.out.println("digite o numero da agencia");
        String agencia = scan.nextLine();

        System.out.println("digite o seu nome");
        String nome = scan.nextLine();

        System.out.println("digite o seu saldo");
        double saldo = scan.nextDouble();
        scan.nextLine();
    
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", e sua conta é " + conta + ", seu saldo de " + saldo + "R$ já está disponivel para saque.");
    }
}