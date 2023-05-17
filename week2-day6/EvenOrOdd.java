//5. WAP to check whether a number is even or odd.
import java.util.Scanner;
public class EvenOrOdd
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
  int a;
  System.out.println("enter the value of a");
  a = sc.nextInt();
  if(a%2==0)
  {
    System.out.println("given number is even");
  }
  else 
  {
   System.out.println("given number is odd"); 
  }
}
}