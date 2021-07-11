public class Function
{

    public static int sumOfNumbers(int a, int b)// formal parameters
    {
     int sum = a + b; 
     return sum;  
    }
    public static void main(String[] args)
    {
        int val1 = 10, val2 = 20;
        int result = sumOfNumbers(val1,val2);// actual parameters
        System.out.println(result);
        System.out.println(Math.min(val1,val2));
        System.out.println(Math.abs(-100));


    }
}
