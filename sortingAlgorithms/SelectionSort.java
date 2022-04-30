import java.util.*;
public class SelectionSort
{

    public static void main(String[] args)
    {
        System.out.println("Selection Sort");

        int[] arr = new int[]{5,3,2,4,6};
        System.out.println("Before Sorting!");
        System.out.println(Arrays.toString(arr));

        //selection sort

        for(int i=0;i<arr.length;i++)
        {
            int min = arr[i];
            int minIndex = i;
            for(int j = i + 1;j<arr.length;j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    minIndex = j;
                }
            }

            //swap i and minIndex

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

       


        System.out.println("After Sorting!");
        System.out.println(Arrays.toString(arr));
    }
}
