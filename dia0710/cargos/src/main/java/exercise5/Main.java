package exercise5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String clear = "\033\143";
        Scanner entrada = new Scanner(System.in);
        Funcionary functionary = new Funcionary();

        System.out.print(clear + "Insira o cargo no qual irá: ");
        functionary.Profession = entrada.nextLine();
        
        System.out.println();

        System.out.print("Insira o valor do seu salário: ");
        functionary.Salary = entrada.nextDouble();
        
        System.out.println(clear);
        functionary.Show();

        entrada.close();
    }
}