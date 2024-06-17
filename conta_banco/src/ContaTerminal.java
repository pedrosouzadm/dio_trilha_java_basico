import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, estaremos fazendo o registro da sua conta ao nosso sistema e precisamos de alguns dados. Por favor, informe a seguir!\n");

        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.println("Digite sua agência: ");
        String agency = sc.nextLine();

        int account;
        while (true) {
            System.out.println("Digite sua conta: ");
            try {
                account = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.next();
            }
        }

        double balance;
        while (true) {
            System.out.println("Digite seu saldo: ");
            try {
                balance = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                sc.next();
            }
        }

        String output = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque."
                , name, agency, account, balance);

        System.out.println(output);
        sc.close();
    }
}