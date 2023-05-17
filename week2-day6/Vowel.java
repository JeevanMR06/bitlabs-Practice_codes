//WAP to input any alphabet and check whether it is vowel or    consonant
import java.util.Scanner;
public class Vowel
  {
    public static void main(String[] args)
    {
      Scanner sc =new Scanner(System.in);
      char a;
      System.out.println("enter the alphabet");
      a = sc.next().charAt(0);
      if(((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))||((a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')))
      {
        System.out.println("it is vowel");
      }
      else
      {
        System.out.println("it is consonant");
      }
      
    }
  }