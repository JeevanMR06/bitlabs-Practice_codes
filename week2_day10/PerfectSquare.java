//Write a program that takes in a number as input and outputs whether it is a perfect square or not. Use conditional statements to implement this program
import java.lang.Math;
import java.util.Scanner;
public class PerfectSquare
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int value = sc.nextInt();
      double sq = Math.sqrt(value);
      if(sq==(int)sq)
      {
        System.out.println("it is perfect square");
      }
      else
      {
         System.out.println("it is not a perfect square");
      }
    }
  }