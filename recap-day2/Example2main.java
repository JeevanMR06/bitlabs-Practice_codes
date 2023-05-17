//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000 else add "medium"
import java.util.Scanner;
  public class Example2main
  {
    public static void main(String[] args)
    {
      Program4 p = new Program4();
      p.program();
    }
  }
class Program4
  {
    public void program()
    {
       Scanner sc = new Scanner(System.in);
      System.out.println("enter the integer");
      float n =sc.nextFloat();
      if(n==0)
      {
        System.out.println("zero");
      }
      else 
      {
        if(n>0)
        {
        System.out.println("given integer is positive");
        }
        if(n<0)
          System.out.println("given number is negative");
        if(n<1)
        {
          System.out.println("small");
        }
         if(n<=999999&&n>=1)
        {
         System.out.println("large"); 
        }
        if(n>=1000000)
        {
          System.out.println("medium");
        }
      }
    }
  }