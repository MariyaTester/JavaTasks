package BasicCourse.Functions;

public class CreatingMultiplicationTableArray {
    public static void main(String[] args) {
        printMultiplicationTable(createMultiplicationTable(10));
    }

    public static int[][] createMultiplicationTable(int maxNumberInTable) {
        int[][] multiplicationTable = new int[maxNumberInTable][maxNumberInTable];
        for (int i = 0; i < maxNumberInTable; i++) {
            for (int j = 0; j < maxNumberInTable; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiplicationTable;
    }

    public static void printMultiplicationTable(int[][] arrayForPrint) {
        for (int[] ints : arrayForPrint) {
            for (int j : ints) {
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
    }
}
