import java.util.Scanner;
public class Example2
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String name;
      int age;
      float percentage;
      System.out.println("enter the name");
      name = sc.next();
      System.out.println("enter the age");
      age = sc.nextInt();
      System.out.println("enter the graduate percentage");
      percentage = sc.nextFloat();
      System.out.println("details of the person is "+"name = "+name+     "age = "+ age+       "percentage ="+ percentage);
    }
  }
      
      