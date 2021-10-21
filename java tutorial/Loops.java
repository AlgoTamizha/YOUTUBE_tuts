public class Loops
{
    public static void main(String[] arg)
    {
        int n = 1;

        // System.out.println(n);
        // System.out.println(n + 1);
        // System.out.println(n + 2);
        // System.out.println(n + 3); 1 2 3 4 5 6 7 ...

        //while loop control variable
        // while(n <= 10) 
        // {
        //     System.out.println(n);
        //     n = n * 2;
        // }

        //For Loop
        // for(int i = 1; i < 5; i++)
        // {
        //     System.out.println(i);
        // }

        //do while
        // do
        // {
        //     n = n+10;  // 1 -> 11 
        // }
        // while(n < 0);// 11 < 0 F
        // System.out.println(n);

        //For each (enhanced for)
        String[] arr = new String[]{"Algo","Tamizha","",};

        // for(int i = 0; i < arr.length; i++)
        // {
        //     System.out.println(arr[i]);
        // }

        for(String a : arr)
        {
            System.out.println(a);
        }


    }
}
