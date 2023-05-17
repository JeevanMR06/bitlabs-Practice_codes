/*Given an integer, , perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20 , print Weird
If  is even and greater than 20 , print Not Weird*/
import java.util.Scanner;
  public class Exanple1main
  {
    public static void main(String[] args)
    {
      Program3 p = new Program3();
      p.program();
    }
  }
class Program3
  {
    public void program()
    {
       Scanner sc = new Scanner(System.in);
      System.out.println("enter the integer");
      int n = sc.nextInt();
      if(n%2!=0)
      {
       System.out.println("weird");
      }
      else if(n%2==0)
      {
        if(n>=2&&n<=5)
        {
           System.out.println("not weird");
        }
         else if(n>=6&&n<=20)
        {
           System.out.println("weird");
        }
        else
        {
          System.out.println("Not weird");
        }
      }
    }
  }
    
      
