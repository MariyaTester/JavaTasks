package BasicCourse.Sorting;

public class FastSorting {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }
        int leftBound = 0;
        int rightBound = numbers.length - 1;
        for (int i : numbers) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        sortArray(numbers, leftBound, rightBound);
        for (int i : numbers) {
            System.out.printf("%4d", i);
        }
    }

    public static int[] sortArray(int[] arrayOfNumbers, int leftBound, int rightBound) {
        if (rightBound - leftBound == 0) {
            return arrayOfNumbers;
        } else if (rightBound - leftBound == 1) {
            if (arrayOfNumbers[rightBound] < arrayOfNumbers[leftBound]) {
                int buffer = arrayOfNumbers[leftBound];
                arrayOfNumbers[leftBound] = arrayOfNumbers[rightBound];
                arrayOfNumbers[rightBound] = buffer;
            }
            return arrayOfNumbers;
        }
        int referenceElement = arrayOfNumbers[leftBound];
        int i = leftBound;
        int j = rightBound;
        while (i <= j) {
            while (arrayOfNumbers[i] < referenceElement) {
                i++;
            }
            while (arrayOfNumbers[j] > referenceElement) {
                j--;
            }
            if (i <= j) {
                int buffer = arrayOfNumbers[i];
                arrayOfNumbers[i] = arrayOfNumbers[j];
                arrayOfNumbers[j] = buffer;
                i++;
                j--;
            }
        }
        if (i < rightBound) {
            sortArray(arrayOfNumbers, i, rightBound);
        }
        if (j > leftBound) {
            sortArray(arrayOfNumbers, leftBound, j);
        }
        return arrayOfNumbers;
    }
}
