import java.util.Scanner;
public class AreaOfRectangle
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int width;
      int height;
      int area;
      System.out.println("enter the values");
      width = sc.nextInt();
      height = sc.nextInt();
      area = width*height;
      System.out.println("Area of Rectangle = "+area);
      
    }
  }