import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.print("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }
}