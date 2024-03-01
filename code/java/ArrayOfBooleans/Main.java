package code.java.ArrayOfBooleans;

public class Main {
  public static void main(String[] args) {
    boolean[] trueArray = arrayOfBooleans(true);

    for (boolean b : trueArray) {
      System.out.println(b);
    }
  }

  public static boolean[] arrayOfBooleans(boolean allTrue) {
    boolean[] array_inside = new boolean[5];

    if (allTrue) {
      for (int i = 0; i < 5; i++) {
        array_inside[i] = true;
      }
    }

    return array_inside;
  }
}
