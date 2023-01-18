package BasicCourse.Functions;

public class MaxInArray {
    public static void main(String[] args) {
        double[] firstArray = {4.9, 2.5, 100.01, -40.0};
        double[] emptyArray = new double[0];
        System.out.println(findMax(firstArray));
        System.out.println(findMax(emptyArray));
    }
  public static double findMax(double[] array) {
      if (array.length == 0) {
          return -1;
      }
      double max = array[0];
      for (int i = 1; i < array.length; i++) {
          if (array[i] > max) {
              max = array[i];
          }
      }
     return max;
  }
}
