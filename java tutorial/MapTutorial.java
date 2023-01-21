import java.util.*;

public class MapTutorial
{
    public static void main(String[] args)
    {   
        //{"Apple":10,"Orange" : 20,"papaya":500}
        //HashMap

    //    Map<String,Integer> quantity = new HashMap<>();

    //    quantity.put("Apple",10);
    //    quantity.put("Orange",20);
    //    quantity.put("papaya",500);

    
    //    for(String key : quantity.keySet())
    //    {
    //     System.out.println(key + "->" + quantity.get(key));
    //    }

    //    quantity.put("Apple",quantity.get("Apple") + 10);

    //    for(String key : quantity.keySet())
    //    {
    //     System.out.println(key + "->" + quantity.get(key));
    //    }

    //    System.out.println(quantity.containsKey("Apple"));
    //    System.out.println(quantity.containsKey("Dragon Fruit"));
      
        //LinkedHashMap

        // Map<String,Integer> quantity = new LinkedHashMap<>();

        
        // quantity.put("Orange",20);
        // quantity.put("papaya",500);
        // quantity.put("Apple",10);
 
     
        // for(String key : quantity.keySet())
        // {
        //  System.out.println(key + "->" + quantity.get(key));
        // }
 
        // quantity.put("Apple",quantity.get("Apple") + 10);
 
        // for(String key : quantity.keySet())
        // {
        //  System.out.println(key + "->" + quantity.get(key));
        // }
 
        // System.out.println(quantity.containsKey("Apple"));
        // System.out.println(quantity.containsKey("Dragon Fruit"));
        //TreeMap
        Map<String,Integer> quantity = new TreeMap<>();

        
        quantity.put("Orange",20);
        // quantity.put("papaya",500);
        // quantity.put("Apple",10);
 
     
        for(String key : quantity.keySet())
        {
         System.out.println(key + "->" + quantity.get(key));
        }
 
        // quantity.put("Apple",quantity.get("Apple") + 10);
 
        // for(String key : quantity.keySet())
        // {
        //  System.out.println(key + "->" + quantity.get(key));
        // }
 
        // System.out.println(quantity.containsKey("Apple"));
        // System.out.println(quantity.containsKey("Dragon Fruit"));

    }
}