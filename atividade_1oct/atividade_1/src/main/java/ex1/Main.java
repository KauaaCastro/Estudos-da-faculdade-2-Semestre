package ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto product = new Produto();
        Produto.Clear();

    System.out.println("Qual produto está sendo adquirido pelo usúario? ");
    System.out.print("Produto: ");
    product.name = entrada.next();
    
    Produto.Clear();
    System.out.println("Qual o valor do produto? ");
    System.out.print("Valor (sem desconto): ");
    product.price = entrada.nextDouble();

    Produto.Clear();
    System.out.println("Qual a porcentagem do desconto? ");
    System.err.println("Desconto (com %): ");
    String PorcentageDescount = entrada.next();

    int DescountValor = Integer.parseInt(PorcentageDescount.replace("%", "").trim());
    product.descount = DescountValor;

    Produto.Clear();
    product.show();
  
     entrada.close();
 }
}