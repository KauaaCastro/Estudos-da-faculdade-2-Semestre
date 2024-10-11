package com.example;

public class Funcionary {
    String Name;
    double Salary;

    public void Show(){
        if(Salary <= 2000){
            double porcentage = (5 * Salary) / 100;
            this.Salary = Salary - porcentage;
            System.out.println("Desconto de 5%");
            System.out.println("O valor de desconto é de: R$" + porcentage);
            System.out.println("O total calculado é: " + this.Salary );
        } else if(Salary >= 2001 && Salary <= 3500){
            double porcentage = (10 * Salary) / 100;
            this.Salary = Salary - porcentage;
            System.out.println("Desconto de 10%");
            System.out.println("O valor de desconto é de: R$" + porcentage);
            System.out.println("O total calculado é: " + this.Salary );
        } else if(Salary > 3500){
            double porcentage = (15 * Salary) / 100;
            this.Salary = Salary - porcentage;
            System.out.println("Desconto de 15%");
            System.out.println("O valor de desconto é de: R$" + porcentage);
            System.out.println("O total calculado é: " + this.Salary );
        }
        
    }

}
