package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String clear = "\033\143";
        Scanner entrada = new Scanner(System.in);
        Salaries justment = new Salaries();

        System.out.print(clear + "Insira o Nome do funcionário: ");
        justment.Name = entrada.nextLine();

        System.out.print("Insira seu cargo: ");
        justment.Load = entrada.nextLine();

        System.out.print("Insira a sua idade: ");
        justment.Age = entrada.nextLine();


        System.out.print("Insira seu atual salário: R$");
        justment.Salaries = entrada.nextInt();
        
        System.out.println(clear);
        justment.Show();

        entrada.close();
    }
}