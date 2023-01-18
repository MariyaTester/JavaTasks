package BasicCourse.Sorting;

public class SortingByChoice {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }
        for (int i : numbers) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        getSortedArray(numbers);
    }

    public static void getSortedArray(int[] arrayOfNumbers) {
        int indexOfMinNumber;
        int minNumberInArray;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            minNumberInArray = arrayOfNumbers[i];
            indexOfMinNumber = i;
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[j] < minNumberInArray) {
                    minNumberInArray = arrayOfNumbers[j];
                    indexOfMinNumber = j;
                }
            }
            if (i != indexOfMinNumber) {
                arrayOfNumbers[indexOfMinNumber] = arrayOfNumbers[i];
                arrayOfNumbers[i] = minNumberInArray;
            }
        }
        for (int i : arrayOfNumbers) {
            System.out.printf("%4d", i);
        }
    }
}