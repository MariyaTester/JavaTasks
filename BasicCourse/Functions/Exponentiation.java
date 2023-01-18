package BasicCourse.Functions;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(getNumberInDegree(2, 4));
        System.out.println(getNumberInDegree(0, 0));
        System.out.println(getNumberInDegree(1, 2));
        System.out.println(getNumberInDegree(23, 1));
        System.out.println(getNumberInDegree(45, 0));
        System.out.println(pow(248, 3));
    }

    public static int getNumberInDegree(int basis, int degree) {
        int numberInDegree = basis;
        if (degree == 0) {
            return 1;
        } else if (degree == 1) {
            return numberInDegree;
        } else if (basis == 0) {
            return numberInDegree;
        } else {
            for (int i = 2; i <= degree; i++) {
                numberInDegree = numberInDegree * basis;
            }
            return numberInDegree;
        }
    }
    public static int pow(int basis, int degree) {
        if (degree == 0) {
            return 1;
        }
        return pow(basis, degree-1) * basis;
    }
}
