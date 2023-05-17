//write a java program to check whether number is a valid mobile number or not( A number is valid mobile  number if it contains 10 digits)(use  only conditionals)(don't use loops)
import java.util.Scanner;
public class Program8main
  {
    public static void main(String[] args)
    {
      program p = new program();
      p.program();
    }
  }
     class Program 
    {
      public void program()
      {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the mobile number");
      String number = sc.next();
        if(number.length()==10)
          System.out.print("it is valid number");
      else
        System.out.print("it is not valid number");
      }
    }
  