//WAP to input any alphabet and check whether it is vowel or consonant.
import java.util.Scanner;
class program4{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  char ch;
  System.out.println("enter the character");
  ch = sc.next().charAt(0);
  if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
  
    System.out.println("it is vowel");
  
  else
    System.out.println("it is consonant");
}
}