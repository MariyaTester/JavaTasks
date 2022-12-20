package BasicCourse.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите целое число больше 1 и нажмите Enter: ");
        int firstNumber = scanner.nextInt();
        int firstMin = 1;
        while (firstNumber <= firstMin) {
            System.out.println("Введено неверное число. Введите другое целове число, больше 1 и нажмите Enter: ");
            firstNumber = scanner.nextInt();
        }
        System.out.println("Введите другое целовек число, больше первого и нажмите Enter: ");
        int secondNumber = scanner.nextInt();
        int secondMin = firstNumber;
        while (secondNumber <= secondMin) {
            System.out.println("Введено неверное число. Введите другое целое число, больше первого и нажмите Enter: ");
            secondNumber = scanner.nextInt();
        }
        int i = firstNumber;
        int allSum = 0;
        while (i <= secondNumber) {
            allSum += i;
            i++;
        }
        int amountOfNumbers = secondNumber - firstNumber + 1;
        System.out.println("Чисел в указанном диапазоне: " + amountOfNumbers);
        double avg = (double) allSum / amountOfNumbers;
        System.out.println("Среднее арифметическое чисел указанного диапазона = " + avg);
        int j = firstNumber;
        int evenSum = 0;
        int evenNumbers = 0;
        while (j <= secondNumber) {
            if (j % 2 == 0) {
                evenSum += j;
                evenNumbers++;
            }
            j++;
        }
        int evenAvg = evenSum / evenNumbers;
        System.out.println("Среднее арифметическое четных чисел указанного диапазона = " + evenAvg);
    }
}
