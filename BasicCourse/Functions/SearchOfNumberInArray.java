package BasicCourse.Functions;

public class SearchOfNumberInArray {
    public static void main(String[] args) {
        int[] years = {30, 1990, 2000, 10, 1861};
        int[] dates = new int[0];
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] numbers = {20, 180, 32, 910};
        System.out.println(findNumberInArray(years, 10));
        System.out.println(findNumberInArray(dates, 10));
        System.out.println(findNumberInArray(months, 10));
        System.out.println(findNumberInArray(numbers, 10));
    }
    public static int findNumberInArray (int[] array, int desiredNumber) {
        if (array.length == 0) {
            return -1;
        }
        int elementIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == desiredNumber) {
                elementIndex = i;
            }
        }
        return elementIndex;
    }
}
