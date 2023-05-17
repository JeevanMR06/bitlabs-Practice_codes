//WAP to check whether a character is uppercase or lowercase     alphabet.
import java.util.Scanner;
public class UpperOrLower
  {
    public static void main(String[] args)
    {  
      char c;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Charater");
      c = sc.next().charAt(0);
      if (c >= 'A' && c <= 'Z')
      {
      System.out.println(c + " is an Uppercase Alphabet.");
      }
    else if (c >= 'a' && c <= 'z')
    {
      System.out.println(c + " is an Lowercase Alphabet.");
    }
   }
  }