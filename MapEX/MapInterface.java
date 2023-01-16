package MapEX;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args){
        System.out.println("compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction) method");
        //this method is unreliable.Avoid it befor ensuring key-value pair does exist and are non-null
        Map<String, Integer> maps = new HashMap<>();
        maps.put("John", 0);//will throw en exception if either key or value is null
        maps.put("Tommy", 13);
        maps.put("EE", null);
        System.out.println(maps);
        maps.compute("John", (key, val) -> (val == 0)? 1: val + 5);
        System.out.println(maps);
        maps.compute("John", (key, val) -> (val == 0)? 1: val + 5);
        System.out.println(maps);
        try{
//            maps.compute("EE", (key, val) -> 200);//{EE=200, John=6, Tommy=13} it works
            maps.compute("EE", (key, val) -> (val == 0)? 1: val + 5);
        }catch(Exception e) {
            System.out.println("Error! value is null");
        }
        System.out.println(maps);
        try{
//            maps.compute("AA", (key, val) -> 200);//AA=200, it works
            maps.compute("AA", (key, val) -> (val == 0)? 1: val + 5);
        }catch(Exception e) {
            System.out.println("Error! the entry does not exist.");
        }
        System.out.println(maps);
        System.out.println("\n");



        System.out.println("computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction) method");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Aman");
        map.put(20, "Suraj");
        map.put(30, "Harsh");
        System.out.println("HashMap:\n" + map.toString());
        map.computeIfAbsent(40, k -> "Sanjeet");
        System.out.println("New HashMap:\n" + map);
        // this will not effect anything because key 10 is present
        map.computeIfAbsent(10, k -> "Amarjit");
        System.out.println("New HashMap:\n" + map);
        System.out.println("\n");

        System.out.println("computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction) method");
        //will not throw exception if value is null or the entry does not exist.
        System.out.println("HashMap:\n" + maps);
        maps.computeIfPresent("John", (key, val) -> 100 );
        System.out.println("New HashMap:\n" + maps);
        maps.computeIfPresent("EE", (key, val) -> 100 );
        System.out.println("New HashMap:\n" + maps);
        maps.computeIfPresent("AA", (key, val) -> 100 );
        System.out.println("New HashMap:\n" + maps);

        System.out.println("forEach(BiConsumer<? super K,? super V> action) method");
        map.forEach((key,val) ->System.out.print("Key=" + key +"|value=" + val + " "));
//        Key=20|value=Suraj Key=40|value=Sanjeet Key=10|value=Aman Key=30|value=Harsh
        System.out.println("\n");

        System.out.println("put(K key, V value) method");
        System.out.println("HashMap:\n" + map);
        map.put(20, "SS");
        System.out.println("New HashMap:\n" + map);
        System.out.println("\n");

        System.out.println("putIfAbsent(K key, V value) method");
        Map<String, Integer> table = new HashMap<>();
        table.put("Pen", 10);
        table.put("Book", 500);
        table.put("Clothes", 400);
        table.put("Mobile", 5000);
        System.out.println("hashTable: " + table.toString());
        // Inserting non-existing key with value
        String retValue = String.valueOf(table.putIfAbsent("Booklet", 2500));
        System.out.println("Returned value " + "for Key 'Booklet' is: " + retValue);
        System.out.println("hashTable: " + table);
        // Inserting existing key with value
        retValue = String.valueOf(table.putIfAbsent("Book", 4500));
        System.out.println("Returned value" + " for key 'Book' is: " + retValue);
        System.out.println("hashTable: " + table);
        System.out.println("\n");

        //Replaces the entry for the specified key only if it is currently mapped to some value.
        System.out.println("replace(K key, V value) method");
        //Replaces the entry for the specified key only if currently mapped to the specified value.
        System.out.println("replace(K key, V oldValue, V newValue) method");
        System.out.println("replaceAll(BiFunction<? super K,? super V,? extends V> function) method");
        System.out.println("HashMap:\n" + map.toString());
        map.replaceAll((key, val) -> val + "-" + key);
        System.out.println("New HashMap:\n" + map.toString());
        System.out.println("\n");

        System.out.println("getOrDefault(Object key, V defaultValue) method");
        System.out.println("keySet() method");
//        Copies all of the mappings from the specified map to this map (optional operation)
        System.out.println("putAll(Map<? extends K,? extends V> m) method");
        System.out.println("remove(Object key) method");
        //Removes the entry for the specified key only if it is currently mapped to the specified value.
        System.out.println("remove(Object key, Object value) method");

    }
}
