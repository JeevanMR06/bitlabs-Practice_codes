//write a java program to find sum of first digit and last digit of a positive integer
import java.util.Scanner;
public class SumOfFirstDigitmain
  {
    public static void main(String[] args)
    {
      SumOfFirstDigit s = new SumOfFirstDigit();
      s.sumoffirstdigit();
    }
  }
class SumOfFirstDigit
  {
    public void sumoffirstdigit()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the digit");
      int num = sc.nextInt();
     int first_digit = 0,last_digit =0;
    last_digit = num%10;
      do
      {
        first_digit = num%10;
        num = num/10;
      }while(num!=0);
     System.out.println(" sum of first digit and last digit of a positive integer is :"+(first_digit+last_digit));
    }
  }