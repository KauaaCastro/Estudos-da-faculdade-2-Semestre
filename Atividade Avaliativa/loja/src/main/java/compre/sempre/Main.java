package compre.sempre;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String clear = "\033\143"; System.out.println(clear);
        Scanner entrada = new Scanner(System.in);
        Descount descount = new Descount();

        System.out.print("Insira o valor do produto: ");
        descount.Valor = entrada.nextDouble();

        System.out.print("Insira o código do cupom de desconto: ");
        descount.Cupom = entrada.nextInt();
        
        if(descount.Cupom == 100 && descount.Valor <= 400){
            descount.Descount1();
            System.out.println(clear + "O valor inicial do produto é: " + descount.Valor);
            System.out.println("O código do Cupom é: " + descount.Cupom);
            System.out.println("A porcentagem de desconto pelo cupom é: 20%");
            System.out.println();
            System.out.println("O valor final da compra será: " + descount.Descount1());
        } else if(descount.Cupom == 200 && descount.Valor <= 600){
            descount.Descount2();
            System.out.println(clear + "O valor inicial do produto é: " + descount.Valor);
            System.out.println("O código do Cupom é: " + descount.Cupom);
            System.out.println("A porcentagem de desconto pelo cupom é: 25%");
            System.out.println();
            System.out.println("O valor final da compra será: " + descount.Descount2());
        } else if(descount.Cupom == 300 && descount.Valor < 850){
            descount.Descount3();
            System.out.println(clear + "O valor inicial do produto é: " + descount.Valor);
            System.out.println("O código do Cupom é: " + descount.Cupom);
            System.out.println("A porcentagem de desconto pelo cupom é: 30%");
            System.out.println();
            System.out.println("O valor final da compra será: " + descount.Descount3());
        } else if(descount.Cupom != 100 && descount.Cupom != 200 && descount.Cupom != 300){
            descount.Descount4();
            System.out.println(clear + "O valor inicial do produto é: " + descount.Valor);
            System.out.println("O código do Cupom é: " + descount.Cupom);
            System.out.println("A porcentagem de desconto pelo cupom é: 15%");
            System.out.println();
            System.out.println("O valor final da compra será: " + descount.Descount4());
        } else {
            descount.Descount4();
            System.out.println(clear + "O valor inicial do produto é: " + descount.Valor);
            System.out.println("O código do Cupom é: " + descount.Cupom);
            System.out.println("A porcentagem de desconto pelo cupom é: 15%");
            System.out.println();
            System.out.println("O valor final da compra será: " + descount.Descount4());
        }
        entrada.close();
    }
}