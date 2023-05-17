//WAP to calculate sum of digits of a number.
import java.util.Scanner;
public class SumOfDigitmain
  {
    public static void main(String[] args)
    {
      SumOfDigit s = new SumOfDigit();
      s.sumofdigit();
      
    }
  }
class SumOfDigit
  {
    public void sumofdigit()
    {
      int digit,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the digit");
      int num = sc.nextInt();
      do
      {
        digit = num%10;
        sum = sum+digit;
        num = num/10;
        
      }while(num!=0);
        System.out.println("sum of digits of a number:"+ sum);
    }
  }