//program to find the frequency of array elements and duplicate value and distinct value

import java.util.Scanner;
public class Duplicate
  {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of elements");
       int length = sc.nextInt();
      int a[] = new int[length];
       System.out.println("enter the number");
      for(int i=0;i<length;i++)
        {
          a[i] = sc.nextInt();
        }
      int count;
    boolean visited[] = new boolean[length];
    for(int i=0;i<length;i++)
        {
         if(visited[i]==true)
         {
           continue;
         }
        count =1;
      for(int j=i+1;j<length;j++)
        {
          if(a[i]==a[j])
          {
            count++;
            visited[i] = true;
          }
        }
       if(count>1)
          {
            System.out.println("The duplicate value is "+a[i]);
          }
        if(count==1)
          {
            System.out.println("The distinct value is "+a[i]);

          }
        }
    }
  }