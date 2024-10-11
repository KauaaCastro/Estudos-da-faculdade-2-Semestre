package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String clear = "\033\143"; 
        Bank bank = new Bank();
        Scanner entrada = new Scanner(System.in);

        System.out.println(clear);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            
            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();
            System.out.println(clear);

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor a ser depositado: ");
                    double DepositValor = entrada.nextDouble();
                    bank.Deposit(DepositValor);
                    break;

                case 2:
                    System.out.print("Informe o valor a ser sacado: ");
                    double WhithDrawlValor = entrada.nextDouble();
                    bank.WithDrawl(WhithDrawlValor);
                    break;
                
                    case 3:
                bank.Show();
                @SuppressWarnings("unused")
                char x = entrada.next().charAt(0);
                break;

                case 4:
                    System.out.println("Saindo...");
                    entrada.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            entrada.close();
        }
    }
}
 