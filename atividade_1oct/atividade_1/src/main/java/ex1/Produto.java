package ex1;

public class Produto {
    public String name;
    public double price;
    public int descount;
    
    public double DescountPrice(){
        double ValorPrice = descount * price / 100;
        return ValorPrice;
    }
    
    public double DescountCalc(){
        double FinalPrice = price - DescountPrice();
        return FinalPrice;
    }
    
    public static void Clear(){
        String clear = "\033\143"; 
        System.out.println(clear);
    }

    public void show(){
        System.out.println("Produto adquirido: " + name);
        System.out.println("Valor inicial do produto: " + price);
        System.out.println("Porcentagem de desconto: " + descount + "%");
        System.out.println("Valor do desconto: " + DescountPrice());
        System.out.println("valor final do produto: " + DescountCalc());
    }
}