package ex6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String clear = "\033\143";
        Scanner entrada = new Scanner(System.in);
        Hospedagem hospedagem = new Hospedagem();

        System.out.println(clear + "Olá viajante!");
        System.out.print("Prazer! Qual seu nome viajante? " );
        hospedagem.Name = entrada.nextLine();

        System.out.println(clear + "Por quantos dias gostariam de ficar hospedados?");
        hospedagem.Days = entrada.nextInt();

        System.out.println(clear);
        hospedagem.Show();
      
        entrada.close();
    }
}