public class OddOrEvenWithConditions
{
    public static void main(String[] args)
    {
        int n = 59;
        String[] arr = new String[]{"even","odd"};

        // 2 - > 10, 3 ->11 ,4->100,5->101,...,10 -> 1010,11 -> 1011

        System.out.println(arr[n & 1]);
         
       
    }
}
