package compre.sempre;

public class Descount {
    double Valor;
    double Cupom;

    public double Descount1(){
        double DescountCalc = Valor * 20 / 100;
        double FinalDescount = Valor - DescountCalc;
        return FinalDescount;
    } 

    public double Descount2(){
        double DescountCalc = Valor * 25 / 100;
        double FinalDescount = Valor - DescountCalc;
        return FinalDescount;
    } 
    
    public double  Descount3(){
        double DescountCalc = Valor * 30 / 100;
        double FinalDescount = Valor - DescountCalc;
        return FinalDescount;
    } 

    public double Descount4(){
        double DescountCalc = Valor * 15 / 100;
        double FinalDescount = Valor - DescountCalc;
        return FinalDescount;
    }
}
