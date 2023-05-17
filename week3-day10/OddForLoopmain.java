//WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class OddForLoopmain
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
    { int i,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num= sc.nextInt();
     for(i=1;i<=num;i= i+2)
       {
         sum = sum+i;
       }
     System.out.println(" sum of all odd numbers is :" +sum);
    }
  }