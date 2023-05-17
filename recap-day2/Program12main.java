//36. WAP to find power of a number.
import java.util.Scanner;
  public class Program12main
  {
    public static void main(String[] args)
    {
      Program12 p = new Program12();
      p.program();
    }
  }
class Program12
  {
    public void program()
    {
       Scanner sc = new Scanner(System.in);
      System.out.println("enter the input");
      int num = sc.nextInt();
      
      if((num & (num-1)) == 0)
      {
       System.out.println("it is a power of two ");
      }
      else
      {
        System.out.println("it is a not power of two ");
      }
      
    }
  }
  