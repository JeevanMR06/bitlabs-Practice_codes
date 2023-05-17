//Write a Java program that prompts the user to enter their age and prints out the number of years left until they can retire (assuming retirement age is 65)
import java.util.Scanner;
public class RetirementMain
  {
    public static void main(String[] args)
    {
       Retirement r = new  Retirement();
      r.retirement();
    }
  }


class Retirement
  {
    public void retirement()
    {
      Scanner sc = new Scanner(System.in);
      int age;
      System.out.println("enter the age");
      age = sc.nextInt();
      if(age<65)
      {
        System.out.println("not yet retired and the age left for retirement is"+(65-age));
      }
      else
      {
        System.out.println("retired");
      }
    }
  }
  