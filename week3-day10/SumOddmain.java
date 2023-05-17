//WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class SumOddmain
  {
    public static void main(String[] args)
    {
      Odd o=new Odd();
      o.sumodd();
    }
  }
class Odd
  {
    public void sumodd()
    { int i=1,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num= sc.nextInt();
      do
      {
        sum = sum+i;
        i = i+2;
      }
        while(i<=num);
     System.out.println("sum of odd number is:" + sum);
    }
  }