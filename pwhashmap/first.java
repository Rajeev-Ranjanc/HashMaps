//create a hashmap using java hashmap class to store the following pairs(Person , Age) and display them
package pwhashmap;

import java.util.HashMap;
import java.util.Map;

public class first {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Akash" , 21);
        map.put("Rajeev" , 22);
        map.put("Abhishek" , 25);
        map.put("Rahul" , 24);

        for(Map.Entry<String , Integer> pair : map.entrySet()){
            System.out.println("Age of "+ pair.getKey() + ": "+pair.getValue());
        }

    }
}
