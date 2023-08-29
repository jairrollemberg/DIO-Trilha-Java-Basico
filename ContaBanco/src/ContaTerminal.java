import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+ nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " +
         agencia + ", conta " + numero + " e o seu saldo R$" + saldo + " ja esta disponivel para saque. ");

    }
}
