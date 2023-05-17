//1. WAP to find maximum between two numbers.
import java.util.Scanner;
public class Maxof2Num
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
  int a,b;
  System.out.println("enter the value of a");
  a = sc.nextInt();
   System.out.println("enter the value of b");
  b = sc.nextInt();
  if(a>b)
  {
    System.out.println("a is greater than b");
  }
  else
    System.out.println("b is greater than a");
}
}