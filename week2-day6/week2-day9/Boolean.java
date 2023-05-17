//write a java program to read the boolean value and print the opposite value
import java.util.Scanner;
public class Boolean
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      boolean a;
      System.out.println("enter the value");
      a = sc.nextBoolean();
      if(a==true)
      {
        System.out.println("false");
      }
      else
      {
       System.out.println("true"); 
      }
    }
  }