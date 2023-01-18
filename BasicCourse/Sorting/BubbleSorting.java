package BasicCourse.Sorting;

public class BubbleSorting {
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
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arrayOfNumbers.length - i - 1; j++) {
                if (arrayOfNumbers[j] > arrayOfNumbers[j + 1]) {
                    int buffer = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j + 1];
                    arrayOfNumbers[j + 1] = buffer;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        for (int i : arrayOfNumbers) {
            System.out.printf("%4d", i);
        }
    }
}
