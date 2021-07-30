import java.util.Scanner;

public class HollowStar {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      if(n%2==0)
      {
        System.out.println("Enter only odd number");
        return;
      }
      int outside_space = n/2;
      int inside_space = 1;
      for(int i=0;i<n;i++)
      {
       //spaces
       //int outside_space = Math.abs(n/2 - i);
       for(int j=0;j<outside_space;j++)
        System.out.print(' ');
       if(i < n/2)
          outside_space-=1;
        else
          outside_space+=1;
      
       //star
       if(i == 0 || i == n-1)
        System.out.println("*");
      else
      {
        //star 1
        System.out.print("*");
        //space
        // int inside_space = n - 2 * (outside_space + 1);
        for(int j = 0;j<inside_space;j++)
          System.out.print(" ");
        if(i < n/2)
          inside_space+=2;
        else
          inside_space-=2;
        //star 2
        System.out.println("*");
      }
       
      }
      
    }
}
