package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String clear = "\033\143"; System.out.println(clear);
        Scanner entrada = new Scanner(System.in);
        Month month = new Month();

        System.out.println("Qual idioma você deseja rodar? ");
        System.out.println("1 - Português");
        System.out.println("2 - Para inglês");
        month.Leanguage = entrada.nextInt();
        
        System.out.println();
        System.out.println("Digite o número do mês que deseja ver: ");
        month.NumbMonth = entrada.nextInt();

        System.out.println(clear);
        month.Idiome();

        entrada.close();
    }
}