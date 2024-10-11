package com.example;

public class Salaries {
    String Name;
    String Load;
    String Age;
    double Salaries;
  
    public double ReadJustment(){
        double Porcentage = (Salaries * 38)/100;
        double NewSalaries = Salaries + Porcentage;
        return NewSalaries;
    }

    public double Gratification(){
        double BrutePorcentage = (ReadJustment() * 20)/100;
        double BruteGratification = ReadJustment() + BrutePorcentage;
        return BruteGratification;
    }

      public double Tax(){
        double tax = (Gratification() * 15)/100;
        double FinalSalaries = Gratification() - tax;
        return FinalSalaries;
    }

    public void Show(){
        System.out.println("Dados:");
        System.out.println();
        System.out.println("Nome: " + Name);
        System.out.println("Idade: " + Age);
        System.out.println("Cargo: " + Load);
        System.out.println();
        System.out.println("Salário Bruto: R$" + ReadJustment());
        System.out.println("Salário total (com gratificaçao): R$" + Gratification());
        System.out.println("Salário liquído: R$" + Tax());
    }
    
}
