package BasicCourse.Cycles;

public class CycleFor {
    public static void main(String[] args) {
        System.out.println("Цифры диапазона [0-100]: ");
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\nЦифры диапазона [7-121]: ");
        for (int i = 7; i <= 121; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\nЦифры диапазона [100-30]: ");
        for (int i = 100; i >= 30; i--) {
            System.out.printf("%4d", i);
        }
    }
}
