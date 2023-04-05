package HardLevelCourse.Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ListWithoutDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> prototype = new ArrayList<>(Arrays.asList(1, 5, 2, 1, 3, 5));
        ArrayList<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < prototype.size() - 1; i++) {
            if (!finalList.contains(prototype.get(i))) {
                finalList.add(prototype.get(i));
            }
        }
        System.out.println(Arrays.toString(finalList.toArray()));
    }
}
