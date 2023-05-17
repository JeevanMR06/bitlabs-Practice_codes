//Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places
import java.util.Scanner;
import java.lang.Math;
public class Exanple3main
  {
    public static void main(String[] args)
    {
      Program6 m = new Program6();
      m.program();
    }
  }
class Program6
  {
    public void program()
    {
       Scanner sc = new Scanner(System.in);
      System.out.println("enter the first number");
      float a = sc.nextFloat();
      System.out.println("enter the second number");
      float b = sc.nextFloat();
      float absolute_value = Math.abs(a-b);
      if(absolute_value<0.001)
      {
        System.out.println("same up to three decimal places");
      }
      else
      {
        System.out.println(" Not same up to three decimal places");
      }
    }
  }