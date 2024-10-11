package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo rectangle = new Retangulo();
        Retangulo.Clear();

        System.out.print("Insira a altura do retangulo: ");
        rectangle.height = entrada.nextDouble();
        System.out.print("Insira a Largura do retangulo: ");
        rectangle.width = entrada.nextDouble();

        rectangle.show();
        entrada.close();
    }
}