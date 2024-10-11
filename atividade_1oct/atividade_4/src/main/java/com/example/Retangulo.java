package com.example;

public class Retangulo {
    double height;
    double width;

    public double AreaCalc(){
        double calc = height * width;
        return calc; 
    }
    public static void Clear(){
    System.out.println("\033\143");
    }

    public void show(){
        System.out.println("A altura do retangulo é: " + height);
        System.out.println("A largura do retangulo é: " + width);
        System.out.println();
        System.out.println("A área do retangulo calculado é de: " + AreaCalc());
    }
}
