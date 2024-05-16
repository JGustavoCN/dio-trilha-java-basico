import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author José Gustavo
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\\n");
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta!");
        numero = teclado.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = teclado.next();
        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = teclado.next();
        System.out.println("Por favor, digite o valor do saldo!");
        saldo = teclado.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\n");
    }
}
