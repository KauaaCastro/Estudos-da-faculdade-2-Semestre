package ex2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno student = new Aluno();
        Aluno.clear();

        System.out.println("Verificaçao do aluno: ");
        System.out.print("Nome completo: ");
        student.name = entrada.nextLine();

        Aluno.clear();
        System.out.print("Nota do aluno: ");
        student.note = entrada.nextDouble();

        Aluno.clear();
        student.Aprove();

        entrada.close();
    }
}