package BasicCourse.Sorting;

public class SortingByInserts {
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
        for (int i : numbers) {
            System.out.printf("%4d", i);
        }

    }

    public static int[] getSortedArray(int[] arrayOfNumbers) {
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            int buffer = arrayOfNumbers[i];
            int j = i;
            if (buffer < arrayOfNumbers[j - 1]) {
                while ((j - 1) >= 0 && buffer < arrayOfNumbers[j - 1]) {
                    arrayOfNumbers[j] = arrayOfNumbers[j - 1];
                    j--;
                }
                arrayOfNumbers[j] = buffer;
            }
        }
        return arrayOfNumbers;
    }
}
