package salario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        System.out.println("\033\143");
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual seu salário? ");
        double salario = entrada.nextDouble();

        System.out.print("Digite o valor da prestaçao: ");
        double prestação = entrada.nextDouble();

        double empréstimo = salario * 0.2;

        if(prestação > empréstimo){
            System.out.println("O empréstimo pode ser concedido!");
        } else {
            System.out.println("O empréstimo nao pode ser concedido!");
        }
        entrada.close();
    }
}