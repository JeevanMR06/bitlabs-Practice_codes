//import java.util.Scanner;

public class Pos_Neg {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    //System.out.println("Enter the length of the array: ");
    // int len = sc.nextInt();
    int[] num = { 10, 20, -50, 30, 40 };
    int pos = 0;
    int neg = 0;

   // System.out.println("Enter the elements of the array:");
    for (int i = 0; i < 5; i++) {
      // num[i] = sc.nextInt();
      if (num[i] > 0) {
        pos++;
      } else if (num[i] < 0) {
        neg++;
      }
    }
    System.out.println("Number of Positive elements: " + pos);
    System.out.println("Number of Negative elements: " + neg);
  }
}
