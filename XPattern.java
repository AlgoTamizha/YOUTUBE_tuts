/*

ZOHO Second round question - 30 min

Write a program to print the following output for the given input. 
You can assume the string is of odd length

Eg 1: Input: 12345,abc
       Output:
1       5 
  2   4
    3
  2  4
1      5

*/
import java.util.Scanner;

public class XPattern
{
    public static void main(String [] args)
    {
        System.out.println("Enter Odd length String");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int left = 0;
        int right = s.length() - 1;

        boolean flag = false;

        for(int i=0;i<s.length();i++)
        {
          for(int j = 0; j < left;j++)
          {
            System.out.print(" ");
          }
          System.out.print(s.charAt(left));
          for(int j=0;j<right - left;j++)
          {
            System.out.print(" ");
          }
          if(left != right)
            System.out.println(s.charAt(right));
          
          if(left == right)
          {
            System.out.println();
            flag = true;
          }
          if(!flag)
          {
            left = left + 1;
            right = right - 1;
          }
          else
          {
           left = left - 1;
           right = right + 1; 
          }

        }
        
    }
}