import java.util.Scanner;

public class Marks {
  public static void main(String[] args) {
    Marks_1 call = new Marks_1();
    call.sub();
  }
}

class Marks_1 {
  public void sub() {
    int[] marks = new int[5];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < marks.length; i++) {
      System.out.println("Enter Subject Marks " + (i + 1) + ":");
      marks[i] = sc.nextInt();
    }
    System.out.println("Marks of Student: ");
    for (int i = 0; i < marks.length; i++)
      System.out.println(marks[i]);

    int total = 0;
    for (int i = 0; i < marks.length; i++) {
      total = total + marks[i];
    }
    double average = (double) total / marks.length;

    System.out.println("Total marks: " + total);
    System.out.println("Average marks: " + average);
  }
}