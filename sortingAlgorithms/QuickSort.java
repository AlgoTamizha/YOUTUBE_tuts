import java.util.*;
public class QuickSort {
    public static void main(String[] args)
    {

        int nums[] = {2,1,10,6,5};
        System.out.println("Original array -> " + Arrays.toString(nums) + "\n");
        quickSort(nums, 0, nums.length - 1);
        System.out.println("Sorted with Quick Sort -> " + Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int left, int right)
    {
        if(left >= right)
            return;

        int pivot = right;
        int pivotValue = nums[pivot];
        int pivotFinalPosition = left;
        for(int i = left; i < right; i++)
        {
            if(nums[i] < pivotValue)
            {
                int temp = nums[i];
                nums[i] = nums[pivotFinalPosition];
                nums[pivotFinalPosition] = temp;
                
                pivotFinalPosition++;
            }
        }
        
        int temp = nums[pivotFinalPosition];
        nums[pivotFinalPosition] = pivotValue;
        nums[pivot] = temp;
        System.out.println("After pivot swapping -> " + Arrays.toString(nums) + "\n");

        quickSort(nums, left, pivotFinalPosition - 1);
        quickSort(nums , pivotFinalPosition + 1, right);
    }
}