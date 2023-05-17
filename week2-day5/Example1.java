import java.util.Scanner;
public class Example1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a,b;
System.out.println("enter the values");
a = sc.nextInt();
b = sc.nextInt();
System.out.println("addition of two values is"+(a+b));
System.out.println("subtraction of two values is"+(a-b));
System.out.println("division of two values is"+(a/b));
}
}