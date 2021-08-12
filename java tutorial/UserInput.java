import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);

       System.out.println("Enter Age"); 
       int age = s.nextInt();

       System.out.println("Enter Height"); 
       float h = s.nextFloat();

       System.out.println("Enter Name"); 
       String name = s.next();

       System.out.println("Age : " + age);
       System.out.println("Height : " + h);
       System.out.println("Name : " + name);


       
       



       

       
    }
}
