//Write a Java program that prompts the user to enter three numbers and finds the maximum and minimum values.
import java.util.Scanner;
public class MaxAndMinmain
  {
    public static void main(String[] args)
    {
      MaxAndMin a = new MaxAndMin();
      a.maxandmin();
    }
  }

      
class MaxAndMin
  {
    public void maxandmin()
    {
       Scanner sc = new Scanner(System.in);
      int a,b,c;
      System.out.println("enter the a value");
      a = sc.nextInt();
      System.out.println("enter the b value");
      b = sc.nextInt();
      System.out.println("enter the c value");
      c = sc.nextInt();
      if((a>b)&&(a>c))
      {
        System.out.println("a is maximum and the value is" + a);
      }
      else if((b>a)&&(b>c))
      {
        System.out.println("b is maximum and the value is" + b);
      }
      else if((c>a)&&(c>b))
      {
        System.out.println("c is maximum and the value is" + c);
      }
    
      if((a<c)&&(a<b))

      {
        System.out.println("a is minimum and the value is" + a);
      }
        else if((b<a)&&(b<c))
      {
        System.out.println("b is minimum and the value is" + b);
      }
        else if((c<a)&&(c<b))
      {
        System.out.println("c is minimum and the value is" + c);
      }
      
    }
  }

