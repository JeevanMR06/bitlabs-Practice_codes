// WAP to input any alphabet and check whether it is vowel or consonant.
import java.util.Scanner;
public class Program10main
  {
    public static void main(String[] args){
    Program10 pn = new Program10();
    pn.program();
  }
  }
class Program10
  { 
    
    public void program()
    {

      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the input");
      ch = sc.next().charAt(0);
     switch(ch)
       {
         case 'a':System.out.println("it is vowel");
      
         case 'e':System.out.println("it is vowel");
          
         case 'i':System.out.println("it is vowel");
      
         case 'o':System.out.println("it is vowel");
          
           case 'u':System.out.println("it is vowel");
           
           case 'A':System.out.println("it is vowel");
        
         case 'E':System.out.println("it is vowel");
           
         case 'I':System.out.println("it is vowel");
           
         case 'O':System.out.println("it is vowel");
           
           case 'U':System.out.println("it is vowel");
           break;
           
           default : System.out.println("it is consonant");
       }
      
    }
  }