//. WAP to check whether a character is uppercase or lowercase alphabet.
import java.util.Scanner;
class program3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  char ch;
  System.out.println("enter the character");
  ch = sc.next().charAt(0);
  if(ch>='a'&&ch<='z')
  {
    System.out.println("it is lowercase");
  }
  else if(ch>='A'&&ch<='Z') 
  {
    System.out.println("it is uppercase");
  }
  else
  {
    System.out.println("invalid input");
  }
}
}