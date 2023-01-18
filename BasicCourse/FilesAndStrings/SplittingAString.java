package BasicCourse.FilesAndStrings;

public class SplittingAString {
    public static void main(String[] args) {
        String prototype = "1, 2, 3, 4, 5";
        String[] numbers = prototype.split(", ");
        int sum = 0;
        for (String number : numbers) {
            int j = Integer.parseInt(number);
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
