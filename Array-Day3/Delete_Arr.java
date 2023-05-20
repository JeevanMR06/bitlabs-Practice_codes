import java.util.Scanner;
public class Delete_Arr {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size: ");
      int len = sc.nextInt();
      int[] a = new int[len];
      System.out.println("Enter the  array elements");
        for(int i=0; i<len; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements before deleting:");
        for(int i=0; i<len; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Enter the position of an element to be delete: ");
        int pos = sc.nextInt();
        for(int i=pos; i<len; i++) {
            a[i] = a[i+1];
        }
        --len;
        System.out.println("Array elements after deleting:");
        for(int i=0;i<len;i++) {
            System.out.println(a[i] + " ");
        }
    }
}