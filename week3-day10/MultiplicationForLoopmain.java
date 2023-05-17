//WAP to print multiplication table of any number.
import java.util.Scanner;
public class MultiplicationForLoopmain
  {
    public static void main(String[] args)
    {
      Multiplication m = new Multiplication();
      m.multiplication();
    }
  }
class Multiplication
  {
    public void multiplication()
    { int i=1;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the table number");
     int num = sc.nextInt();
     for(;i<=10;i++)
       {
         System.out.println(num+"x"+i+"="+(num*i));
       }
    }
  }