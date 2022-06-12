import java.util.*;
public class BubbleSort
{
    public static void main(String[] args)
    {
        System.out.println("Bubble Sort!");

        int[] arr = new int[]{5,3,2,4,6};
        System.out.println("Before Sorting!");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After Sorting!");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[])
    {
        
        while(true)
        {
            boolean sorted = true;
            for(int i =0;i<arr.length - 1;i++)// i i + 1
            {
                if(arr[i] > arr[i + 1])
                {
                    sorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            if(sorted)
                break;
        }

    }
}


/*
Time:

worst : 9 8 7 6 5 O(n2)
best : 1 2 3 4 5 O(n)


Space : 

    O(1)
*/
