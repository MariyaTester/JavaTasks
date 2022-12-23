package BasicCourse.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите числа для диапазона. Введите первое целое число больше 1 и нажмите Enter: ");
        int start = scanner.nextInt();
        for (; start < 1;) {
            System.out.println("Введено неверное число, число должно быть больше 1.\nВведите целое число больше 1 и нажмите Enter: ");
            start = scanner.nextInt();
        }
        System.out.println("Введите второе целое число, которое больше первого и нажмите Enter: ");
        int end = scanner.nextInt();
        for (; end <= start;) {
            System.out.println("Введено неверное число, второе число должно быть больше введенного ранее.\nВведите целое число больше первого и нажмите Enter: ");
            end = scanner.nextInt();
        }
        int begin = start;
        int sum = 0;
        for (; begin <= end; begin++) {
            sum += begin;
        }
        int amountOfNumbers = end - start +1;
        double allAvg = (double) sum/amountOfNumbers;
        System.out.println("Среднее арифметическое чисел указанного диапазона = " + allAvg);
        int i = 0;
        int evenNum = start;
        int evenNumbersSum = 0;
        for (; evenNum <= end; evenNum++) {
            if (evenNum%2 == 0) {
                evenNumbersSum += evenNum;
                i++;
            }
        }
        double evenAvg = (double)evenNumbersSum/i;
        System.out.println("Среднее арифметическое чётных чисел указанного диапазона = " + evenAvg);

    }
}
