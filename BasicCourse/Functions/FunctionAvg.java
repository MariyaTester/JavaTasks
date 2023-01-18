package BasicCourse.Functions;
public class FunctionAvg {
    public static double findAverage(int begin, int end) {
        int start = begin;
        int sum = 0;
        while (start <= end) {
            sum += start;
            start++;
        }
        int amountOfNumbers = end - begin + 1;
        return (double) sum / amountOfNumbers;
    }
    public static void main(String[] args) {
        double firstAvg = findAverage(1, 179);
        double secondAvg = findAverage(-8, 54);
        double thirdAvg = findAverage(1, 18);
        System.out.println("Среднее арифметическое чисел первого диапазона [1; 179] = " + firstAvg);
        System.out.println("Среднее арифметическое чисел второго диапазона [-8; 54] = " + secondAvg);
        System.out.println("Среднее арифметическое чисел третьего диапазона [1; 18] = " + thirdAvg);
    }
}
