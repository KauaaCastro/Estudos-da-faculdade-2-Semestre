package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String clear = "\033\143";
        Scanner entrada = new Scanner(System.in);

        System.out.println(clear + "Quantos funcionários serao avaliados? ");
        int Employees = entrada.nextInt();

        double[] Salaries = new double[Employees];

        int i; int AddSalaries = 0;
        for(i = 0; i < Employees; i++){
            System.out.println("Insira o Salário do funcionário " + (i + 1) + ": R$");
            Salaries[i] = entrada.nextDouble();
            AddSalaries += Salaries[i];
        }
        
        double MeddiaSalaries = AddSalaries / Employees;
        System.out.println( clear + "Você digitou " + Employees + " funcionários a serem análisado.");
        System.out.println("A média salárial dos funcionários é de: R$" + MeddiaSalaries);
        
        entrada.close();
    }
}