// Write a program that takes in two integers as input and outputs their sum if both the integers are even. If both integers are odd, output their product. If one of the integers is odd and the other is even, output their difference
import java.util.Scanner;
public class CheckOddEven
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int a,b;
      System.out.println("enter the value of a");
      a = sc.nextInt();
      System.out.println("enter the value of b");
      b = sc.nextInt();
      if((a%2==0)&&(b%2==0))
        {
         System.out.println(a+b);
        }
      else if((a%2!=0)&&(b%2!=0))
      {
         System.out.println(a*b);
      }
      else if(((a%2==0)&&(b%2!=0))||((a%2!=0)&&(b%2==0)))
        {
                  System.out.println(a-b);
        }
    }
  }