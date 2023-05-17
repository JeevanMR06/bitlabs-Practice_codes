import java.util.Scanner;
public class Example3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int age, incomeValue;
System.out.println("enter the age");
age = sc.nextInt();
System.out.println("enter the incomeValue");
incomeValue = sc.nextInt();
  if(age>=20 && incomeValue >=50000)
     {
    System.out.println("Both conditions are satisfied");
  }
System.out.println("not satisfied");
}
}
  
  