package BasicCourse.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int exampleNum = 1;
        System.out.println("Пример вывода диапазона чисел от 1 до 100 по 10 в каждой строке:");
        while (exampleNum <= 100){
            System.out.printf("%4d", exampleNum);
            if (exampleNum %10 == 0) {
                System.out.println();
            }
            exampleNum++;
        }
        System.out.println("Введите целое число - начало диапазона: ");
        int start = scanner.nextInt();
        System.out.println("Введите другое целое число - конец диапазона: ");
        int end = scanner.nextInt();
        while (end <= start) {
            System.out.println("Введено неверное число. Введите другое целое число, больше первого и нажмите Enter: ");
            end = scanner.nextInt();
        }
        System.out.println("Введите целое число (от 1 до 15) - количество выводимых чисел в строку: ");
        int length = scanner.nextInt();
        int i = 1;
        int num = start;
        while (num <= end){
            System.out.printf("%3d",  num);
            if (i %length == 0) {
                System.out.println();
            }
            num++;
            i++;
        }
    }
}
