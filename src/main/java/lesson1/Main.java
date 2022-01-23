package lesson1;

import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======================Задание 1-1========================");
        System.out.println("Hello, World!!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("=======================Задание 1-2========================");
        System.out.print("Введите делимое: ");
        double a = sc.nextDouble();
        System.out.print("Введите делитель: ");
        double b = sc.nextDouble();
        double c = a / b;
        System.out.println("Частное = " + c);
        System.out.println("=======================Задание 1-3========================");
        System.out.print("Введите любое число: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели нечетное число");
        }
        System.out.println(greetingUser(LocalTime.now(),"Nikolas"));
    }

    public static String greetingUser(LocalTime t, String userName){
        int currentHours = t.getHour();
        if (currentHours >=5 && currentHours<12) {
            return "Доброе утро, " + userName;
        }
        if (currentHours >=12 && currentHours<16) {
            return "Добрый день, " + userName;
        }
        if (currentHours >=16 && currentHours<23) {
            return "Добрый вечер, " + userName;
        }
        if (currentHours >=23 && currentHours<5) {
            return "Доброй ночи, " + userName;
        }
        return "";
    }
}
