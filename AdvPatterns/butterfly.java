package AdvPatterns;

public class butterfly {
  public static void butterflyPattern(int n) {

    // outer loop upside
    for (int i = 1; i <= n; i++) {

      // starting stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // inbetween spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // ending stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    // downside
    for (int i = n; i >= 1; i--) {

      // starting stars

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // inbetween spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // ending stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    butterflyPattern(8);
  }

}