package BasicCourse.FilesAndStrings;

public class LineBuild {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder();
        int start = 1;
        int end = 100;
        for (int i = start; i <= end; i++) {
            if (i == end) {
                line.append(i);
                break;
            }
            line.append(i)
                    .append(", ");
        }
        String result = line.toString();
        System.out.println(result);
    }
}