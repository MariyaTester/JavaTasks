package BasicCourse.SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите число и нажмите Enter:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число и нажмите Enter:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введите код команды от 1 до 4 и Нажмите Enter:");
        int instruction = scanner.nextInt();
        switch (instruction){
            case 1:
                double sum = firstNumber + secondNumber;
                System.out.println("Результат сложения этих чисел = " + sum);
                break;
            case 2:
                double difference = firstNumber - secondNumber;
                System.out.println("Результат вычетания этих чисел = " + difference);
                break;
            case 3:
                double multiplication = firstNumber * secondNumber;
                System.out.println("Результат умножения этих чисел = " + multiplication);
                break;
            case 4:
                if (secondNumber != 0) {
                    double division = firstNumber / secondNumber;
                    System.out.println("Результат деления этих чисел = " + division);
                } else {
                    System.out.println("На 0 делить нельзя");
                }
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}
