import java.util.*; // ArrayList present in Collection framework
public class ArraysandArrayList
{
public static void main(String[] args)
{
   int[] arr = new int[10];// index starts at 0 arr[0], arr[1]...arr[9]
   //1
   arr[0] = 10;
   arr[1] = 100;
   arr[9] = 999;

   //2
   int[] arr1 = new int[]{1,2,3}; 

   //System.out.println(arr1.length);

   //arraylist
   ArrayList<Integer> list = new ArrayList<>();

   list.add(10);//0
   list.add(20);
   list.add(30);
   list.add(40);
   

   System.out.println(list.size());

   list.remove(2);

   System.out.println(list.size());


  
}
}
