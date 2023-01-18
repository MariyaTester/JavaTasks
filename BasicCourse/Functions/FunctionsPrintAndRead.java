package BasicCourse.Functions;

import java.util.Locale;
import java.util.Scanner;

public class FunctionsPrintAndRead {
    public static int printAndRead (String incomingMessage){
       Scanner scanner = new Scanner(System.in);
       scanner.useLocale(Locale.US);
        System.out.println(incomingMessage);
        int number = scanner.nextInt();
        System.out.println(number);
        return number;
    }

    public static void main(String[] args) {
       int number = printAndRead ("Введите целое число и нажмите Enter: ");
       int a = printAndRead("Введите целое число и нажмите Enter: ");
    }
}
