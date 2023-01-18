package BasicCourse.FilesAndStrings;

public class URLLine {
    public static void main(String[] args) {
        findPartOfString("http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf");
        findPartOfString("https://SomeServerName");
        findPartOfString("");
        findPartOfString("uiefej://SomeServerName/90");
        findPartOfString("Hello world!");
    }

    public static void findPartOfString(String incomingLine) {
        if (incomingLine.length() == 0) {
            System.out.println("Введенная строка пустая");
            return;
        }
        String findingLineStart = "://";
        String findingLineEnd = "/";
        int beginIndex = incomingLine.indexOf(findingLineStart);
        if (beginIndex == -1) {
            System.out.println("Переданная строка не является URL. Не удалось вычленить имя сервера.");
            return;
        }
        beginIndex = incomingLine.indexOf(findingLineStart) + findingLineStart.length();
        int endIndex = incomingLine.indexOf(findingLineEnd, beginIndex + 1);
        if (endIndex == -1) {
            System.out.println(incomingLine.substring(beginIndex));
        } else {
            System.out.println(incomingLine.substring(beginIndex, endIndex));
        }
    }
}


