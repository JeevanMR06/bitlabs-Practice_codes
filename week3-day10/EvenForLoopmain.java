////WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class EvenForLoopmain
  {
    public static void main(String[] args)
    {
      EvenForLoop e = new EvenForLoop();
      e.evenforloop();
    }
  }
class EvenForLoop
  {
    public void evenforloop()
    {
      int sum = 0,i;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num = sc.nextInt();
      for(i=0;i<=num;i=i+2)
        {
          sum = sum+i;
         
        }
       System.out.println("Sum of even number is :" +sum);
    }
  }