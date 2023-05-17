/*WAP to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
import java.util.Scanner;
class program2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  float physics,chemistry,biology,maths,computer,total_marks,percentage;
  System.out.println("enter the marks of physics");
  physics = sc.nextFloat();
  System.out.println("enter the marks of chemistry");
  chemistry= sc.nextFloat();
  System.out.println("enter the marks of biology");
  biology = sc.nextFloat();
  System.out.println("enter the marks of maths");
  maths = sc.nextFloat();
  System.out.println("enter the marks of computer");
  computer= sc.nextFloat();
  total_marks = (physics+chemistry+biology+maths+computer);
  percentage = (total_marks/5);
  if(percentage>=90)
  {
    System.out.println("grade A");
  }
   else if(percentage>=80)
  {
    System.out.println("grade B");
  }
   else if(percentage>=70)
  {
    System.out.println("grade C");
  }
   else if(percentage>=60)
  {
    System.out.println("grade D");
  }
   else if(percentage>=40)
  {
    System.out.println("grade E");
  }
  else
   {
      System.out.println("grade F");
   }
}
}