package BasicCourse.Cycles;

import java.util.Locale;
import java.util.Scanner;

public class CycleForNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("\nРаспечатать числа, кратные четверке от 1 до 100, причем в обратном порядке (начиная сo 100): ");
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.printf("%3d", i);
            }
        }
        System.out.println("\n\nРаспечатать квадраты чисел от 1 до n, где n задается вручную:");
        System.out.println("\nВведите n и нажмите Enter: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%-3.0f", Math.pow(i,2));
        }
    }
}
