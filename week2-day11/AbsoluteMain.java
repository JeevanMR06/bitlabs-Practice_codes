//write a java program to read two integers and calculate absolute value ,square root of two integers
import java.util.Scanner;
import java.lang.Math;
public class AbsoluteMain
  {
    public static void main(String[] args)
    {
      Absolute a = new Absolute();
      a.absolute();
    }
  }
      
      
   class Absolute
     {
       public void absolute()
       {
      
      
      Scanner sc = new Scanner(System.in);
      int a,b;
      System.out.println("enter the value of a");
      a = sc.nextInt();
      System.out.println("enter the value of b");
      b= sc.nextInt();
      int	absa  =  Math.abs(a);
      int	absb  =  Math.abs(b);
      double sqa = Math.sqrt(a);
      double sqb = Math.sqrt(b);
      System.out.println(" square value of a"+ sqa);
      System.out.println(" square value of b"+ sqb);
      System.out.println(" Absolute value of a"+ absa);
      System.out.println(" Absolute value of b"+ absb);
      }
      
    }
  