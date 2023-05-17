/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.X can be placed before L (50) and C (100) to make 40 and 90.C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.
 
Example 1:
Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4*/
import java.util.Scanner;
public class RomanNum
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int num;
      String sum = "";
      char I = 1,V = 5,X = 10,L = 50,C = 100,D = 500,M = 1000;
      System.out.println("enter the num");
      num = sc.nextInt();
      while(num>0)
        { int i;
          if(num/1000>0)
          {
          for(i=0;i<num/1000;i++)
            {
              sum+="M";
            }
            num = num%1000;
          }
          else if(num/900>0)
          {
              for(i=0;i<num/900;i++)
            {
              sum+="CM";
          }
              num = num%900;
          }
          else if(num/500>0)
          {
              for(i=0;i<num/500;i++)
                {
                  sum+="D";
                }
              num = num%500;
          }
          else if(num/400>0)
          {
            for(i=0;i<num/400;i++)
                {
                  sum+="CD";
                }
              num = num%400;
          }
            else if(num/100>0)
          {
            for(i=0;i<num/100;i++)
                {
                  sum+="C";
                }
              num = num%100;
          }
          else if(num/90>0)
          {
            for(i=0;i<num/90;i++)
                {
                  sum+="XC";
                }
              num = num%90;
          }
          else if(num/50>0)
          {
            for(i=0;i<num/50;i++)
                {
                  sum+="L";
                }
              num = num%50;
          }
          else if(num/40>0)
          {
            for(i=0;i<num/40;i++)
                {
                  sum+="XL";
                }
              num = num%40;
          }
           else if(num/10>0)
          {
            for(i=0;i<num/10;i++)
                {
                  sum+="X";
                }
              num = num%10;
          }
           else if(num/9>0)
          {
            for(i=0;i<num/9;i++)
                {
                  sum+="IX";
                }
              num = num%9;
          }
           else if(num/5>0)
          {
            for(i=0;i<num/5;i++)
                {
                  sum+="V";
                }
              num = num%5;
          }
          else if(num/4>0)
          {
            for(i=0;i<num/4;i++)
                {
                  sum+="IV";
                }
              num = num%4;
          }
           else if(num/1>0)
          {
            for(i=0;i<num/1;i++)
                {
                  sum+="I";
                }
              num = num%1;
          }        
    }
  }
  }