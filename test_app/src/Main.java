import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        // Вызовите ниже методы в правильном порядке
        sayHello();
        goodDay();
        welcomeUserByName();
        printSuccess();
    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        // Спросите пользователя, из какого он города, используя метод printCity()
        printCity();
        // И проинициализируйте строковую переменную city при помощи объекта scanner аналогично тому, как проинициализирована переменная name выше
        String city = scanner.next();
        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }

    // Допишите метод sayHello(), который печатает: Привет!
    public static void sayHello(){
        System.out.println("Привет!");
    }
    // Допишите метод goodDay(), который выводит строку: Хорошего дня!
    public static void goodDay(){
        System.out.println("Хорошего дня!");
    }
    // Допишите метод printCity(), который спрашивает: Из какого вы города?
    public static void printCity(){
        System.out.println("Из какого вы города?");
    }
}