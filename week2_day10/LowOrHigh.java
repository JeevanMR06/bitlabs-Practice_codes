//Given two non-negative integers low and high,find the count of odd numbers between low and high (inclusive). use conditional statements only(not loops)
import java.util.Scanner;
public class LowOrHigh
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int low,high,count;
      System.out.println("enter the low number");
      low = sc.nextInt();
      System.out.println("enter the high number");
      high = sc.nextInt();
      if((low%2==0))
      {
        low++;
      }
      if((high%2==0))
      {
        high--;
      }
      count = (high-low)/2+1;
      System.out.println("count of odd numbers is"  +count);
      
    }
  }