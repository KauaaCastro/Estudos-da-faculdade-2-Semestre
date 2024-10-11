package ex6;

public class Hospedagem {
    int Days;
    String Name;
    
    //considerando a taxa de serviço por estadia, portanto, uma taxa somente!
    public void Show(){
        double Tax = 0; double Valor = 0; double Calc = 0;

        if(Days < 15){
             Valor = 250; 
             Tax = 150;
             Calc = (Valor * Days) + Tax;
        } else if(Days == 15){
             Valor = 220;
             Tax = 130;
             Calc = (Valor * Days) + Tax;
        } else if(Days > 15){
             Valor = 180;
             Tax = 100;
             Calc = (Valor * Days) + Tax;
        }    
                System.out.println("Dados: " + Name);
                System.out.println("Você permanecerá hospedado por " + Days + " dias");
                System.out.println("O valor da taxa de serviço é de R$" + Tax);
                System.out.println("O valor da diária é de: R$" + Valor);
                System.out.println();
                System.out.println("O valor total dos dias de hospedagem mais a taxa de serviço é de R$" + Calc);
    }
}

