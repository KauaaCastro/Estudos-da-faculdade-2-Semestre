package aposentadoria;

public class Work {
    private int year = 2024;
    public int DateToCalc;
    public int IngressYear;
    public int FunCode;
    
    public int CalcWorked(){
        int WorkedTime = year - IngressYear;
        return WorkedTime; 
    }

    public int Age(){
        int AgeCalc = year - DateToCalc;
        return AgeCalc; 
    }

    public void ShowOne(){
        System.out.println("O funcionário detentor do código: " + FunCode + ", possui os seguintes requisitos: ");
        System.out.println("Idade: " + Age());
        System.out.println("Ano de ingresso: " + IngressYear);
        System.out.println("Tempo de serviço: " + CalcWorked());
        System.out.println();
        System.out.println("Requerer Aposentadoria");
        System.out.println("Deseja continuar para o próximo funcionário? (s/n) ");
    }

    public void ShowTwo(){
        System.out.println("O funcionário detentor do código: " + FunCode + ", possui os seguintes requisitos: ");
        System.out.println("Idade: " + Age());
        System.out.println("Ano de ingresso: " + IngressYear);
        System.out.println("Tempo de serviço: " + CalcWorked());
        System.out.println();
        System.out.println("Não requerer");
        System.out.println("Deseja continuar para o próximo funcionário? (s/n) ");
    }

}

