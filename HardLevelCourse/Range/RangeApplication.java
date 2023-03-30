package HardLevelCourse.Range;

import java.util.Arrays;

public class RangeApplication {
    public static void main(String[] args) {
        Range range1 = new Range(5.5, 9.9);
        Range range2 = new Range(10.5, 15.9);
        Range range3 = new Range(15.5, 19.9);
        Range range4 = new Range(16.0, 20.8);
        Range range5 = new Range(16.0, 20.8);
        System.out.println(range1.getRangeLength());
        System.out.println(range1.isInside(5.5001));
        System.out.println(range1.isInside(10));
        System.out.println(range1.isCross(range1));
        System.out.println(range1.isCross(range2));
        System.out.println(range2.isCross(range3));
        System.out.println(range3.isCross(range4));
        System.out.println("Объединение диапазонов: " + Arrays.toString(range1.union(range2)));
        System.out.println("Объединение диапазонов: " + Arrays.toString(range2.union(range3)));
        System.out.println("Разности диапазонов: " + Arrays.toString(range1.difference(range2)));
        System.out.println("Разности диапазонов: " + Arrays.toString(range4.difference(range5)));
        System.out.println("Разности диапазонов: " + Arrays.toString(range2.difference(range3)));
    }
}
