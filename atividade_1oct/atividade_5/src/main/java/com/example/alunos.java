package com.example;

public class alunos {
    String Name;
    String ClassRoom;
    double FirstNote;
    double SecondNote;
    double ThirdNote;
    double FourthNote;

    public String FirstName(){
        String[] PartName = Name.split(" ");
        String Rename = PartName[0];
        return Rename;
    }

    public double CalcNotes(){
        double calc = (FirstNote + SecondNote + ThirdNote + FourthNote) / 4;
        return calc; 
    }

    public void Show(){
        System.out.println("Aluno: " + Name);
        System.out.println("Classe: " + ClassRoom);
        System.out.println("Média: " + CalcNotes());
        System.out.println("Boletim: ");
    
        //tabela feita apenas para ficar bonitinho, não tem um objetivo pronto nem nada do tipo
        System.out.println("+----------------+----------+----------+----------+----------+");
        System.out.println("| Name           | 1st Trim | 2nd Trim | 3rd Trim | 4th Trim |");
        System.out.println("+----------------+----------+----------+----------+----------+");
        System.out.printf("| %-14s | %-8s | %-8s | %-8s | %-8s |\n", FirstName(), FirstNote, SecondNote, ThirdNote, FourthNote);
        System.out.println("+----------------+----------+----------+----------+----------+");
    }
}