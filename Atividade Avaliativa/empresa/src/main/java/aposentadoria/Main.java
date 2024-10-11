package aposentadoria;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    String clear = "\033\143";
    Scanner entrada = new Scanner(System.in);
    Work work = new Work();
    int thirtyAge = 0; 
    int Employes = 0;

    while(true){
           int Code; int BornDate; int Working;
           System.out.print(clear + "Insira o código do funcionário: ");
             Code = entrada.nextInt(); work.FunCode = Code;

            System.out.println();
            System.out.print("Insira o ano de nascimento: ");
             BornDate = entrada.nextInt(); work.DateToCalc = BornDate;

            System.out.println();
            System.out.print("Insira o ano de ingresso na empresa: ");
            Working = entrada.nextInt(); work.IngressYear = Working;
            System.out.println(clear);
            
        if(work.Age() >= 65){
            Employes++;
            work.ShowOne();
            String Continue = entrada.next();
             if(Continue.equalsIgnoreCase("n")){
                 break;
             }
        } else if(work.CalcWorked() >= 30 && work.Age() <= 65){
            thirtyAge++;
            Employes++;
            work.ShowOne();
            String Continue = entrada.next();
             if(Continue.equalsIgnoreCase("n")){
                 break;
             }
        } 
        else if(work.Age() >= 60 && work.CalcWorked() >= 25){
            Employes++;
            work.ShowOne();
            String Continue = entrada.next();
          
             if(Continue.equalsIgnoreCase("n")){
                 break;
             }  
        } else {
            Employes++;
            work.ShowTwo();
            String Continue = entrada.next();
             if(Continue.equalsIgnoreCase("n")){
                 break;
             }
          }
        }
        System.out.println();
        System.out.println("A quantidade de funcionários com mais de 30 anos de serviço é: " + thirtyAge);
        System.out.println("A quantidade de Funcionários análisados foram: " + Employes);
        entrada.close();
    }
}

