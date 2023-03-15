import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Задача №1" + "\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.print("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("\n" + "Задача №2" + "\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите температуру воздуха: ");
        int temp = input.nextInt();
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else if (temp > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("\n" + "Задача №3" + "\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите вашу скорость движения в км/ч: ");
        int speed = input.nextInt();
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("\n" + "Задача №4" + "\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любой возраст: ");
        int age = input.nextInt();
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if ( age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("\n" + "Задача №5" + "\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите возраст вашего ребенка: ");
        int ageKids = input.nextInt();
        if (ageKids < 5) {
            System.out.println("Если возраст ребенка равен " + ageKids +", то ему нельзя кататься на аттракционе");
        } else if (ageKids > 5 && ageKids < 14) {
            System.out.println("Если возраст ребенка равен " + ageKids +", то ему можно кататься на аттракционе в сопровождении");
        } else if (ageKids > 14) {
            System.out.println("Если возраст ребенка равен " + ageKids +", то ему нельзя кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("\n" + "Задача №6" + "\n");
        int totalVagon = 102;
        int totalVagonSit = 60;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер места указанного в билете: ");
        int numberPass = input.nextInt();
        if (numberPass <= totalVagonSit) {
            System.out.println("В вагоне есть сидячие места");
        } else if (numberPass > totalVagonSit && numberPass <= totalVagon) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне мест нет");
        }

    }
    public static void task7 () {
        System.out.println("\n" + "Задача №7" + "\n");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " самое большое");
        }

    }
}