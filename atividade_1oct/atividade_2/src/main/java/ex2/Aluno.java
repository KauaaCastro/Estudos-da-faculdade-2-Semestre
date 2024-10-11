package ex2;

public class Aluno {
    public String name;
    public double note;


    public static void clear(){
        String Clear = "\033\143";
        System.out.println(Clear);
    }

    public double NoteRecuse(){
        double FinalNote = 6 - note;
        return FinalNote; 
    }

    public double NoteAprove(){
        double FinalNote = note - 6;
        return FinalNote;
    }

    public void Aprove(){
    if(note >= 0 && note <= 10){
        if(note < 6){
            System.out.println("Aluno: " + name);
            System.out.println("Situação: Reprovado.");
            System.out.println("Nota final: " + note);
            System.out.println("Faltam " + NoteRecuse() + " pontos para a aprovaçao!");
        } else {
            System.out.println("Parabéns, " + name + ", você foi aprovado!");
            System.out.println("Aluno: " + name);
            System.out.println("Situaçao: Aprovado.");
            System.out.println("Nota final: " + note);
            System.out.println("O aluno foi aprovado com " + NoteAprove() + " pontos acima da média!");
        }
    }
    }
}
