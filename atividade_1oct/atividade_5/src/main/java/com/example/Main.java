package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        alunos Notes = new alunos();
        String clear = "\033\143"; System.out.println(clear);

        System.out.println("Consulta de boletim.");
        System.out.println();
        System.out.print("Qual aluno deseja consultar? (Nome completo) ");
        Notes.Name = entrada.nextLine();
        System.out.print("Qual sua classe? ");
        Notes.ClassRoom = entrada.nextLine();
        System.out.println(clear);

        while(true){
            System.out.print("Digite a 1ª nota: ");
            Notes.FirstNote = entrada.nextDouble();
            System.out.print("Digite a 2ª nota: ");
            Notes.SecondNote = entrada.nextDouble();
            System.out.print("Digite a 3ª nota: ");
            Notes.ThirdNote = entrada.nextDouble();
            System.out.print("Digite a 4ª nota: ");
            Notes.FourthNote = entrada.nextDouble();
            
            if(Notes.FirstNote <= 10 && Notes.FirstNote >= 0 &&
            Notes.SecondNote <= 10 && Notes.SecondNote >= 0 &&
            Notes.ThirdNote <= 10 && Notes.ThirdNote >= 0 &&
            Notes.FourthNote <= 10 && Notes.FourthNote >= 0){
                System.out.println(clear);
                break;
            } else{
                System.out.println("Uma ou mais notas estão fora do padrão, tente novamente inserindo uma nota entre 0 e 10");
                Thread.sleep(3000);
            }
        }
        Notes.Show();
        entrada.close();
    }
}