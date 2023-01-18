package BasicCourse.Functions;

public class OverloadFunctionsSizes {
    public static int getTypeSize (byte variable) {
        return 1;
    }
    public static int getTypeSize (short variable) {
        return 2;
    }
    public static int getTypeSize (int variable) {
        return 4;
    }
    public static int getTypeSize (long variable) {
        return 8;
    }
    public static int getTypeSize (float variable) {
        return 4;
    }
    public static int getTypeSize (double variable) {
        return 8;
    }

    public static void main(String[] args) {
        int byteNumber = getTypeSize((byte) 34);
        System.out.println(byteNumber + " байт");

        int shortNumber = getTypeSize((short) 56);
        System.out.println(shortNumber + " байта");

        int intNumber = getTypeSize(786);
        System.out.println(intNumber + " байта");

        int longNumber = getTypeSize(764L);
        System.out.println(longNumber + " байт");

        int floatNumber = getTypeSize(555.09f);
        System.out.println(floatNumber + " байта");

        int doubleNumber = getTypeSize(109.742);
        System.out.println(doubleNumber + " байт");
    }
}
