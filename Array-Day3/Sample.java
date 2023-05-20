import java.util.Scanner;
public class Sample
{
    public static void main(String[] args)
    {
        int[] a = new int[50];
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of an array and elements");
        int size = obj.nextInt();
        for(int i=0; i<size; i++)
        {
            a[i] = obj.nextInt();
        }
        System.out.println("ARRAY ELEMENTS BEFORE DELETION");
        for(int i=0; i<size; i++)
        {
            System.out.println(a[i] + " ");
        }
        System.out.println("Enter the position where the element should be inserted");
        int pos = obj.nextInt();
        for(int i=pos; i<size; i++)
        {
            a[i] = a[i+1];
        }
        --size;
        System.out.println("ARRAY ELEMENTS AFTER DELETION");
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}