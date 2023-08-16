import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      enter_operation();
    }
    public static void enter_operation() {

        Scanner obj_input = new Scanner(System.in);

        System.out.println("Введите число от 1 до 3");

        int number = obj_input.nextInt();

        if (number == 1) {
            System.out.println("Вы ввели число 1");
        }
        else if (number == 2) {
            System.out.println("Вы ввели число 2");
        }
        else if (number == 3) {
            System.out.println("Вы ввели число 3");
        }
        else {
            System.out.println("Вы ввели число больше 3");
        }
    }
}