public class PrintWithoutLoop
{
    public static void main(String[] args)
    {
       String name = "AlgoTamizha";
       String number = "0";

       number = number.replaceAll("0","0000000000"); //1 -> 10 //0000000000
       number = number.replaceAll("0","0000000000");//10 * 10 ->100 //00000000000000000....

       name = number.replaceAll("0",name + "\n");

       System.out.println(name);

    }
}
