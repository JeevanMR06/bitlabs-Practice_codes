//WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class SumEvenmain
  {
    public static void main(String[] args)
    {
      SumOfEven s = new SumOfEven();
      s.sumofeven();
    }
  }
class SumOfEven
  {
    public void sumofeven()
    {
      int sum = 0,i =0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num = sc.nextInt();
      do
      {
        sum = sum+i;
        i = i+2;
      }
        while(i<=num);
      System.out.println("Sum of even number is : "+ sum);
    }
  }