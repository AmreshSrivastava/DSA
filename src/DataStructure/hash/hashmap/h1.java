package DataStructure.hash.hashmap;

import java.util.HashMap;
import java.util.Map;

public class h1 {
    public static void main(String[]args){
        
       HashMap<String,String> map = new HashMap<String,String>();  //key , value  - k-unique
        
       //add
       map.put("India", "New Delhi");
       map.put("USA", "WDC");
       map.put("China", "Beijing");

       System.out.println(map);
       System.out.println("size is : "+ map.size());

       //search - O(1)
       System.out.println(map.containsKey("India"));   //true
       System.out.println(map.containsValue("WDC"));   //true

       //get value by key
       System.out.println(map.get("USA"));  
       
       //check key
    if(map.containsKey("India")){
      System.out.println("key is present");
    }
    else{
        System.out.println("key is not present");
    }
       //check value
    if(map.containsValue("Combodia")){
        System.out.println("value is present");
    }
    else{
        System.out.println("value is not present");
    }

       //remove
       System.out.println(map.remove("Indonesia"));
       
       
       //iterate
       for(Map.Entry<String,String> m : map.entrySet()){
        System.out.println(m);   //m.getkey, m.getvalue

       }

       //replace or overwrite by put
       map.put("India", "ND");
       System.out.println(map);

       //replace- it change value by a key
       map.replace("China", "BJ");
       System.out.println(map);

       
    }
}
