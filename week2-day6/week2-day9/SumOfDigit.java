import java.util.Scanner;
public class SumOfDigit
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int num,sum = 0,digit;
      System.out.println("enter the positive integer");
      num = sc.nextInt();
      while(num>0)
        {
          digit = num%10;
          sum = sum+digit;
          num = num/10;
        }
       System.out.println("sum of the digit = "+sum);
    }
  }