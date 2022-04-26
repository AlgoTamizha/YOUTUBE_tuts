import java.util.*;
public class InsertionSort
{
    public static void main(String args[])
    {
        System.out.println("hello");

        int[] arr = new int[]{5,3,2,4,6};
        System.out.println("Before Sorting!");
        System.out.println(Arrays.toString(arr));

        //insertion sort
        for(int i = 1;i<arr.length;i++)
        {
            int currElement = arr[i];

            int j = i - 1;

            while(j>=0 && arr[j] > currElement) // 2 3 4 5 6 curr = 6
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = currElement;
        }

        System.out.println("After Sorting!");
        System.out.println(Arrays.toString(arr));
    }
}
