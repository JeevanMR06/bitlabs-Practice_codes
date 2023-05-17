
//program to declare and initialize the array elements 
import java.util.Scanner;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int[] marks={10,20,30.4,40,50};
    // float Temp[]={30.4f,34.5f,45,34.5f,33.0f};
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    // System.out.println(marks[3]);
    // System.out.println(marks[4]);
    // int marks[] = new int[3];
    // marks[0]=10;
    // marks[1]=20;
    // marks[2]=30;
    // we can read through keyboard and we can store it in array
    int marks[] = new int[10];
    System.out.println("enter the elements of the array");
    for (int i = 0; i < marks.length; i++)
      marks[i] = sc.nextInt();

    System.out.println("the elements you entered are");
    for (int i = 0; i < marks.length; i++)
      System.out.println(marks[i]);

  }

}