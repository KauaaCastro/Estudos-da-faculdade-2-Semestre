package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String clear = "\033\143"; System.out.println(clear);
        Scanner entrada = new Scanner(System.in);
        Funcionary funcionary = new Funcionary();

        System.out.println("Bem vindo!");
        System.out.print("Insira seu nome: ");
        funcionary.Name = entrada.nextLine();

        System.out.print(clear + "Insira seu salário: ");
        funcionary.Salary = entrada.nextDouble();

        System.out.println(clear + "Olá " + funcionary.Name);
       funcionary.Show();
    
       entrada.close();
    }
}