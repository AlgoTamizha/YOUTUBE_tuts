import java.util.*;
public class SetTutorial {
    
    public static void main(String[] args)
    {
        //HashSet
        //LinkedHashSet
        //TreeSet
        /*{Apple : 10, Orange : 20, Papaya : 100} 
         * {Apple,Orange,Papaya}
        */
        // Set<String> fruitSet = new HashSet<>();
        // //add to set
        // fruitSet.add("Apple");
        // fruitSet.add("Orange");
        // fruitSet.add("Papaya");
        // fruitSet.add("Apple");

        // //fruitSet.remove("Apple");


        // System.out.println(fruitSet);

        // System.out.println(fruitSet.contains("Orange"));
        // System.out.println(fruitSet.contains("Banana"));

        //LinkedHashSet
        // Set<String> fruitSet = new LinkedHashSet<>();
        // //add to set
        // fruitSet.add("Apple");
        // fruitSet.add("Orange");
        // fruitSet.add("Papaya");
        // fruitSet.add("Banana");
        // //fruitSet.add("Apple");

        // //fruitSet.remove("Apple");


        // System.out.println(fruitSet);

        // System.out.println(fruitSet.contains("Orange"));
        // System.out.println(fruitSet.contains("Banana"));

        //TreeSet
        Set<String> fruitSet = new TreeSet<>();
        //add to set
        fruitSet.add("Apple");
        fruitSet.add("Orange");
        fruitSet.add("Papaya");
        fruitSet.add("Banana");
        //fruitSet.add("Apple");

        //fruitSet.remove("Apple");


        System.out.println(fruitSet);

        System.out.println(fruitSet.contains("Orange"));
        System.out.println(fruitSet.contains("Banana"));
    }
}
