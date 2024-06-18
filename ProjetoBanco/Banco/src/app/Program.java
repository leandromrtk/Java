package app;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Digite o nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.print("Tem depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's'){
            System.out.print("Entre com o valor inicial de depósito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }
        else {
            conta = new Conta(numero, titular);
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Dados da conta atualizado: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Dados da conta atualizado: ");
        System.out.println(conta);

        sc.close();
    }
}
