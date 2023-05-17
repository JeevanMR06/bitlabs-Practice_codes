//WAP to print multiplication table of any number.
import java.util.Scanner;
class Program5{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n,i=1;
  System.out.println("enter any number");
  n = sc.nextInt();
  while(i<=10)
    {
      System.out.println(n+"X"+i+" = "+ (n*i));
      i = i+1;
    }
}
}