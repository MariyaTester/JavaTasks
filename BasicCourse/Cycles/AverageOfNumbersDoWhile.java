package BasicCourse.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfNumbersDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите целое число больше 1 и нажмите Enter: ");
        int firstMin = 1;
        int firstNumber;
        do {
            firstNumber = scanner.nextInt();
        } while (firstNumber <= firstMin);
        System.out.println("Введите другое целовек число, больше первого и нажмите Enter: ");
        int secondNumber;
        int secondMin = firstNumber;
        do {
            secondNumber = scanner.nextInt();
        }
        while (secondNumber <= secondMin);
        int i = firstNumber;
        int allSum = 0;
        do {
            allSum += i;
            i++;
        } while (i <= secondNumber);
        int amountOfNumbers = secondNumber - firstNumber + 1;
        System.out.println("Чисел в указанном диапазоне: " + amountOfNumbers);
        double avg = (double) allSum / amountOfNumbers;
        System.out.println("Среднее арифметическое чисел указанного диапазона = " + avg);
        int j = firstNumber;
        int evenSum = 0;
        int evenNumbers = 0;
        do {
            if (j % 2 == 0) {
                evenSum += j;
                evenNumbers++;
            }
            j++;
        }
        while (j <= secondNumber);
        int evenAvg = evenSum / evenNumbers;
        System.out.println("Среднее арифметическое четных чисел указанного диапазона = " + evenAvg);
    }
}
