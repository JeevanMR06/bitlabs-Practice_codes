

import java.util.Scanner;
  public class Program11main
  {
    public static void main(String[] args)
    {
      Program11 p = new Program11();
      p.program();
    }
  }
class Program11
  {
    public void program()
    {
       Scanner sc = new Scanner(System.in);
      System.out.println("enter the input");
      int num = sc.nextInt();
      if(num%2==0)
      {
      if(num==1)
      {
        System.out.println("it is a power of two ");
      }
      }
      else
      {
        System.out.println("it is a not power of two ");
      }
      
    }
  }
  