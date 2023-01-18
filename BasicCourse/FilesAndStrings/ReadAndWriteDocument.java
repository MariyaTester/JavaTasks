package BasicCourse.FilesAndStrings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndWriteDocument {
    public static void main(String[] args) throws FileNotFoundException {
        String[] documentContent = new String[4];
        String path = "BasicCourse/FilesAndStrings/resources/";
        String fileName = "file.txt";
        try (Scanner scanner = new Scanner(new FileInputStream(path + fileName))) {
            int i = 0;
            while (scanner.hasNextLine()) {
                documentContent[i] = scanner.nextLine();
                i++;
            }
        }
        try (PrintWriter writer = new PrintWriter("FileUpperCase.txt")) {
            for (String s : documentContent) {
                writer.println(s.toUpperCase());
            }
        }
    }
}
