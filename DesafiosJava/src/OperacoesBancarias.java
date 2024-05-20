import java.util.Scanner;

/**
 *
 * @author José Gustavo
 */
public class OperacoesBancarias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean executando = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (executando) {
            //System.out.println("1 - Depositar\n2 - Sacar\n3 - Consultar Saldo\n4 - Encerrar");
            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 1:
                    saldo = scanner.nextDouble();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    //System.out.println("Quanto deseja sacar? ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    executando = false;
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
