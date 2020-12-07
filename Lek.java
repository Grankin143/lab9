import java.util.Scanner;

public class Lek {
    String name;
    String mass;
    double price;
    int amount;
    void read() {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner in = new Scanner(System.in, encoding);
        System.out.println("Введите название лекарства");
        name = in.nextLine();
        System.out.println("Введите код лекарства");
        mass = in.nextLine();
        System.out.println("Введите цену лекарства");
        price = in.nextDouble();
        System.out.println("Введите колличество");
        amount = in.nextInt();
    }
    Lek(String mass1, String name1, double price1, int amount1){
        mass = mass1;
        name = name1;
        price = price1;
        amount = amount1;
    }
    Lek(){
        mass = "-";
        name = "-";
        price = 0;
        amount = 0;
    }
    void display(){
        System.out.println("Название лекарства: " + name);
        System.out.println("Код лекарства: " + code);
        System.out.println("Цена лекарства: " + price);
        System.out.println("Колличество: " + amount);
    }
    void setPrice(double price1){
        price = price1;
    }
    void setAmount(int amount1){
        amount = amount + amount1;
    }
    String getMass(){
        return mass;
    }
    int getAmount(){
        return amount;
    }
}
