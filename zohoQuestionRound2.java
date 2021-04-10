import java.util.*;

public class ZohoQuestionRound2 {
    public static void main(String[] args) {
      
      String s = "a1b2c3";
      String num = "";
      char letter = ' ';
      
      for(char c : s.toCharArray())
      {
        if(!(c >= '0' && c <= '9'))
        {
          if(num!="")
          {
          int n = Integer.parseInt(num);
          for(int i =0; i<n;i++)
          {
            System.out.print(letter);
          }
          }
          letter = c;
          num = "";
        }
        else
        {
          num+=c;
        }
      }
      int n = Integer.parseInt(num);
      for(int i =0; i<n;i++)
      {
        System.out.print(letter);
      }
      
       
    }
}
