package main;

// Start with an array of strings and create a new array with each string upcased.
// For example, ["hello", "goodbye"] becomes ["HELLO", "GOODBYE"].
public class Main {
  static void capitalizeMethod(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i].toUpperCase();
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    String[] example = { "story", "duran", "abreu", "toro", "anthony" };
    capitalizeMethod(example);
  }
}