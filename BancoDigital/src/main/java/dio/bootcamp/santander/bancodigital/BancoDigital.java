package dio.bootcamp.santander.bancodigital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Gustavo
 */
public class BancoDigital {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List lista = new ArrayList<>();
        Banco banco = new Banco("H", lista);
        System.out.println(banco.getNome());
        banco.setNome("Gustavo");
        System.out.println(banco.getNome());
        Cliente cliente = new Cliente();
        Conta conta = new ContaCorrente(cliente);
        conta.setSaldo(100);
        System.out.println(conta.getSaldo());
        conta.setNumero(1234);
        System.out.println(conta.getNumero());
        cliente.setNome("Joao");
        System.out.println(cliente.getNome());
        
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
