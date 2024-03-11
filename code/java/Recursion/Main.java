package code.java.Recursion;

import java.lang.Math;

class Main {

  static double PHI = (1 + Math.sqrt(5)) / 2;
  static double PHI_CONJUGATE = (1 - Math.sqrt(5)) / 2;

  public static void main(String[] args) {
    long start, end;

    long n = 50;
  
    start = System.nanoTime();
    System.out.println(fib_regular(n));
    end = System.nanoTime();

    System.out.println("Regular version: " + format_ns(end - start));

    start = System.nanoTime();
    System.out.println(fib_recurse(n));
    end = System.nanoTime();

    System.out.println("Recursive version: " + format_ns(end - start));
  }

  private static long fib_regular(long n) {
    return (long)((Math.pow(PHI, n) - Math.pow(PHI_CONJUGATE, n)) / PHI - PHI_CONJUGATE);
  }

  private static long fib_recurse(long n) {
    if (n < 2) return 1;

    return fib_recurse(n - 1) + fib_recurse(n - 2);
  }

  private static String format_ns(long ns) {
    if (ns < 1e3) {
      return String.format("%dns", ns);
    } else if (ns < 1e6) {
      return String.format("%.3fµs", (float)ns / 1e3);
    } else if (ns < 1e9) {
      return String.format("%.3fms", (float)ns / 1e6);
    }

    return String.format("%.3fs", (float)ns / 1e9);
  }
}
