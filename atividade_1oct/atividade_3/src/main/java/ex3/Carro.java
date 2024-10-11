package ex3;

public class Carro {
    public int age;
    public String name;
    public String tag;

    public static void clear(){
        String clear = "\033\143"; 
        System.out.println(clear);
    }

    public void show(){
        clear();
        System.out.println("Informações do carro: ");
        System.out.println();
        System.out.println("Marca do carro: " + tag);
        System.out.println("Nome do carro: " + name);
        System.out.println("Ano do carro: " + age);
    }
}
