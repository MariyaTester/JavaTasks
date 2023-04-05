package HardLevelCourse.Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOfOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 7, 13, 100, 111, 5, 0, 12, 31));
        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(numbers.get(i));
            } else {
                i++;
            }
        }
        for (int s : numbers) {
            System.out.println(s);
        }
    }
}
