package ex3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carro carinsert = new Carro();
        Carro.clear();

        System.out.println("Cadastro do Carro");
        System.out.print("Marca do carro: ");
        carinsert.tag = entrada.nextLine();


        Carro.clear();
        System.out.print("Nome do carro: ");
        carinsert.name = entrada.nextLine();

        Carro.clear();
        System.out.print("Insira o ano do carro: ");
        carinsert.age = entrada.nextInt();

        carinsert.show();

        entrada.close();
    }
}