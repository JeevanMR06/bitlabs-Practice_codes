// WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
public class SumOfNaturalmain
  {
    public static void main(String[] args)
    {
      SumOfNatural s = new SumOfNatural();
      s.sumofnatural();
    }
  }
class SumOfNatural
  {
    public void sumofnatural()
    {
      int sum = 0,i =1;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num = sc.nextInt();
      do
      {
        sum = sum+i;
        i++;
      }
        while(i<=num);
      System.out.println("Sum of natural number is : "+ sum);
    }
  }
