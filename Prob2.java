import java.util.Scanner;

class Lesson_3_problem_Two {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter two integers: ");
    int a = s.nextInt();
    int b = s.nextInt();
    if (a >= 0 && b >= 0) {
      System.out.println("Both are positive or zero.");
    } else {
      System.out.println("One or both are negative.");
    }
  }
}