package BasicCourse.FilesAndStrings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberOfIncoming {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "BasicCourse/FilesAndStrings/resources/";
        String fileName = "NumberOfIncoming.txt";
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(new FileInputStream(path + fileName))) {
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
        }
        String result = sb.toString().toLowerCase();
        int numberOfIncoming = getNumberOfIncoming(result, "Ижевск");
        if (numberOfIncoming == -1) {
            System.out.println("В документе не найдено указанной строки: документ пустой.");
        } else {
            System.out.println("Количество повторений строки в документе = " + numberOfIncoming);
        }
    }

    public static int getNumberOfIncoming(String incomingLine, String prototype) {
        prototype = prototype.toLowerCase();
        int numberOfIncoming = 0;
        if (incomingLine.length() == 0) {
            return -1;
        } else {
            int index = incomingLine.indexOf(prototype);
                while (index != -1) {
                    numberOfIncoming++;
                    index = incomingLine.indexOf(prototype, index + prototype.length());
                }
            }
        return numberOfIncoming;
    }
}