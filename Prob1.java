import java.util.Scanner;
class Lesson_3_Problem_One
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter an integer:");
    int n = scan.nextInt();
    if ( !( n >= 5 && n <= 76))
    System.out.println("True");
    else
    System.out.println("False");
  }
}