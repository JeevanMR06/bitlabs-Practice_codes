import java.util.Scanner;
public class Swap2num
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int a,b,temp;
      System.out.println("enter the value of a");
      a = sc.nextInt();
      System.out.println("enter the value of b");
      b = sc.nextInt();
      System.out.println("values before swaping  "+"a = "+a+" b = "+b);
      temp = a;
      a = b;
      b= temp;
      System.out.println("values after swaping  "+"a = "+a+" b = "+b);
    }
  }
      
      