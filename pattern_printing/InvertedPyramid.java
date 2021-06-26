import java.util.*;

public class InvertedPyramid {
    public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      
      int stars = 2 * n -1;
      int spaces = 0;
      
      for(int i=0;i<n;i++)
      {
        //spaces
        for(int j=0;j<spaces;j++)
          System.out.print(" ");
        spaces++;
        
        //stars
        for(int j=0;j<stars;j++)
          System.out.print("*");
        stars-=2;
        
        System.out.println();
        
      }
      
      
    }
}
