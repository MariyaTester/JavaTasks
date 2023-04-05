package HardLevelCourse.Lists;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfLinesFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        String path = "BasicCourse/FilesAndStrings/resources/";
        String fileName = "file.txt";
        try (Scanner scanner = new Scanner(new FileInputStream(path + fileName))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        }
        for (String s : lines) {
            System.out.println(s);
        }
    }
}