import java.util.*;
public class Rhombus {
    public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      
      for(int i =1;i<=n;i++)
      {
        //spaces
        for(int j=i;j<n;j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=n;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
      
      
      
      

       
}
}
