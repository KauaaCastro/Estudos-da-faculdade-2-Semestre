package com.example;

public class Month{
    int Leanguage;
    int NumbMonth;

    public void Idiome(){
        if(Leanguage == 1){         
            String[] Month = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"            
            };
        if(NumbMonth >= 1 && NumbMonth <= 12){
            System.out.println("O idioma usado foi: " + Leanguage);
            System.out.println("O número digitado foi: " + NumbMonth);
            System.out.println("O mês correspondente é: " + Month[NumbMonth - 1]);
        }
      } else if(Leanguage == 2){
            String[] Month = {
              "january", "february", "march", "april", "may", "june", 
              "july", "august", "september", "october", "november", "december"
            };
        if(NumbMonth >= 1 && NumbMonth <= 12){
            System.out.println("The language used was: " + Leanguage);
            System.out.println("The number entered was: " + NumbMonth);
            System.out.println("The corresponding month is: " + Month[NumbMonth - 1]);
        }
      }
    }
}
