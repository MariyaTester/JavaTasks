package BasicCourse.Cycles;

public class Cycles {
    public static void main(String[] args) {
        int number = 0;
        int i = 3;
        int evenNumbers = 0;
        while (i < 22) {
            if (i % 2 == 0) {
                number += i;
                evenNumbers++;
            }
            i++;
        }
        System.out.println("Сумма четных чисел диапазона от 3 до 21 включительно = " + number + "\nЧетных чисел в диапазоне от 3 до 21 включительно - " + evenNumbers);
    }
}
