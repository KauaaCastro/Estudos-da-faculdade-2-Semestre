package exercise5;

public class Funcionary {
    String Profession;
    double Salary;

    public void Show(){
    if (Profession.equals("Estagiario")) {
        double Porcentage = 10 * Salary / 100;
        double Calc = Salary + Porcentage;
        System.out.println("Seu novo cargo será: " + Profession);
        System.out.println("Seu salário atualmente é de: " + Salary);
        System.out.println("Seu novo salário será atualmente de: " + Calc);
    } else if (Profession.equals("Junior")) {
        double Porcentage = 12 * Salary / 100;
        double Calc = Salary + Porcentage;
        System.out.println("Seu novo cargo será: " + Profession);
        System.out.println("Seu salário atualmente é de: " + Salary);
        System.out.println("Seu novo salário será atualmente de: " + Calc);
    } else if (Profession.equals("Pleno")) {
        double Porcentage = 14 * Salary / 100;
        double Calc = Salary + Porcentage;
        System.out.println("Seu novo cargo será: " + Profession);
        System.out.println("Seu salário atualmente é de: " + Salary);
        System.out.println("Seu novo salário será atualmente de: " + Calc);
    } else if (Profession.equals("Senior")) {
        double Porcentage = 16 * Salary / 100;
        double Calc = Salary + Porcentage;
        System.out.println("Seu novo cargo será: " + Profession);
        System.out.println("Seu salário atualmente é de: " + Salary);
        System.out.println("Seu novo salário será atualmente de: " + Calc);
    } 
  }
}
