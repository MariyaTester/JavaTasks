package BasicCourse.SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class CommandSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введиде команду print или sum и нажмите Enter:");
        String userLine = scanner.nextLine();
        switch (userLine) {
            case "print":
                System.out.println("Введите строку и нажмите Enter:");
                String userLinePrint = scanner.nextLine();
                System.out.println(userLinePrint);
                break;
            case "sum":
                System.out.println("Введите вещественное число и нажмите Enter:");
                double firstNumber = scanner.nextDouble();
                System.out.println("Введите второе вещественное число и нажмите Enter:");
                double secondNumber = scanner.nextDouble();
                System.out.println(firstNumber + secondNumber);
                break;
            default:
                System.out.println("Неизвестная команда");

        }
    }
}
