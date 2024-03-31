import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Vamos criar sua conta no banco? Para isso, precisaremos de algumas informações.");
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine(); //o método .nextLine possibilita scannear Strings com espaços

        System.out.println("Olá, " + nomeCliente + "! Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Quanto você gostaria de depositar em sua conta?");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco! ;D");
        System.out.println("Sua agência é a " + agencia + ", conta número " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

    }
}