package BasicCourse.Functions;
public class FunctionsMinMax {
    public static int min(int begin, int end) {
        return Math.min(begin, end);
    }
    public static int max(int begin, int end) {
        return Math.max(begin, end);
    }
    public static void main(String[] args) {
        int min1 = min(10, 35);
        int max1 = max(10, 35);
        int min2 = min(-89, 0);
        int max2 = max(-89, 89);
        System.out.println("Первое минимальное число = " + min1 + "; \nПервое максимальное число = " + max1 + ";");
        System.out.println("Второе минимальное число = " + min2 + "; \nВторое максимальное число = " + max2 + ";");

    }
}