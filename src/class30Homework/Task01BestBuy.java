package class30Homework;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

/*
Task 1-
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class Task01BestBuy {
    public static void main(String[] args) {
        LinkedHashMap <Integer,String> bestBuy= new LinkedHashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885, "TV");
        bestBuy.put(7879901, "Laptop");
        bestBuy.put(7879912, "iPhone");
        bestBuy.put(7879923, "MacBookPro");

        Set<Entry<Integer,String>> entrySet= bestBuy.entrySet();
        for (Entry<Integer,String> entry: entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }




    }
}
