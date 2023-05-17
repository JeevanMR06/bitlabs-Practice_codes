//write a java program to generate a random integer and also read an integer from the user and print matched if both are matched else print not matched
import java.util.Scanner;
import java.lang.Random;
  public class Example4main
  {
    public static void main(String[] args)
    {
      Program i = new Program();
      i.program();
    }
  }
class Random
  {
    public void program()
    {
       
       Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int x = Random.nextInt(a);
      if(a==x)
      System.out.println("both are matched");
      else 
      System.out.println("both are not matched");
    }
  }