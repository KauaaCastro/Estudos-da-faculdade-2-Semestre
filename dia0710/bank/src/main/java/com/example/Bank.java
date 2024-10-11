package com.example;

public class Bank {
    double InitialBalance = 1500; 
    double deposit;
    double withdrawl;

    public Bank(){
        this.InitialBalance = 1500;
    }

    public void Deposit(double valor){
        InitialBalance += valor;
        System.out.println("Depósito realizado com sucesso, valor do depósito: " + valor);
    }

    public void WithDrawl(double valor){
        if(this.InitialBalance < valor){
            System.out.println("Operaçao inválida, valor na conta insuficiente! ");
        } else {
        InitialBalance -= valor;
        System.out.println("Saque feito no valor de: " + valor);        
        }
    }
    
    public void Show(){
        System.out.println("Você possui: R$" + InitialBalance);
        System.out.println("Digite para continuar...");
    }
}
