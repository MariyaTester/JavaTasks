package BasicCourse.Functions;

import java.util.Locale;
import java.util.Scanner;

public class FunctionDegreesConversion {
    public static void conversionCelsiusToKelvin(double incomingCelsiusDegrees) {
        double kelvinDegrees = incomingCelsiusDegrees + 273.15;
        System.out.printf("Градусов по Кельвину: %.2f", kelvinDegrees);
    }

    public static void conversionCelsiusToFahrenheit(double incomingCelsiusDegrees) {
        double fahrenheitDegrees = incomingCelsiusDegrees * 1.8 + 32;
        System.out.printf("\nГрадусов по Фаренгейту: %.2f", fahrenheitDegrees);
    }

    public static void getKelvinAndFahrenheit(double incomingCelsiusDegrees) {
        conversionCelsiusToKelvin(incomingCelsiusDegrees);
        conversionCelsiusToFahrenheit(incomingCelsiusDegrees);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);
        System.out.println("Введите температуру в градусах Цельсия и нажмите Enter: ");
        double number = s.nextDouble();
        getKelvinAndFahrenheit(number);
    }
}
