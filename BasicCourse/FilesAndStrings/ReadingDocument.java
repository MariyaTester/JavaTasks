package BasicCourse.FilesAndStrings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingDocument {
    public static void main(String[] args) throws FileNotFoundException {
        String [] documentContent = new String[6];
        String path = "BasicCourse/FilesAndStrings/resources/";
        String fileName = "file.txt";
        try (Scanner scanner = new Scanner(new FileInputStream(path + fileName))) {
            int i = 0;
            while (scanner.hasNextLine()) {
                documentContent[i] = scanner.nextLine();
                i++;
            }
        }
        for (String s : documentContent) {
            System.out.println(s);
        }
    }
}