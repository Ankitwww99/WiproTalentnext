package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
 */
public class AssignmentMap2 {
    static boolean isKeyPresent(HashMap<Integer,String> map, Integer key){
        if (map.containsKey(key))
            return true;
        return false;
    }

    static boolean isValuePresent(HashMap<Integer,String> map, String value){
        if (map.containsValue(value))
            return true;
        return false;
    }

    static void iterateMap(HashMap<Integer,String> map)
    {
        Set set = map.entrySet();
        Iterator<Map.Entry> itr = set.iterator();

        while (itr.hasNext()){
            Map.Entry temp = itr.next();
            System.out.println("roll no:- " + temp.getKey() + " name:- " + temp.getValue());
        }
    }


    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Ankit");
        map.put(2,"Bharka");
        map.put(3,"Chetan");
        map.put(4,"Deepak");

        System.out.println("Info in map");
        iterateMap(map);

        System.out.println("To check if value is present or not, if present returns true else false");
        System.out.println(isValuePresent(map,"Bharka"));
        System.out.println(isValuePresent(map,"Rahon"));

        System.out.println("To check If key is present or not, if present returns true else false");
        System.out.println(isKeyPresent(map,3));
        System.out.println(isKeyPresent(map,9));
    }
}
