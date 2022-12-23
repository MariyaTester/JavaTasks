package BasicCourse.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class DigitsInTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите целое число (минимум двузначное) и нажмите Enter: ");
        int number = scanner.nextInt();
        int dig = number;
        int lastNum;
        int sum = 0;
        while (dig > 0) {
            lastNum = dig % 10;
            dig = dig / 10;
            sum += lastNum;
        }
        System.out.println("Сумма цифр введенного числа = " + sum);
        int digit = number;
        int lastNumber;
        int oddDigitSum = 0;
        while (digit > 0) {
            lastNumber = digit % 10;
            if (lastNumber % 2 != 0) {
                oddDigitSum += lastNumber;
            }
            digit = digit / 10;
        }
        System.out.println("Сумма нечётных цифр введенного числа = " + oddDigitSum);
        int fullDigit = number;
        int lastDigitOfNumber;
        int maxDigitOfNumber = 0;

        while (fullDigit > 0) {
            lastDigitOfNumber = fullDigit % 10;
            if (lastDigitOfNumber > maxDigitOfNumber) {
                maxDigitOfNumber = lastDigitOfNumber;
            }
            fullDigit = fullDigit / 10;
        }
        System.out.println("Максимальная цифра введенного числа = " + maxDigitOfNumber);

    }
}
