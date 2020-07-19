package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
 The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
 */
public class AssignmentMap4 {
    static boolean checkKey(HashMap<String,Integer> ContactList, String CostumerName)
    {
        return ContactList.containsKey(CostumerName);
    }

    static boolean checkValue(HashMap<String,Integer> ContactList, int CostumerNumber)
    {
        return ContactList.containsValue(CostumerNumber);
    }

    static void printAll(HashMap<String,Integer> ContactList)
    {
        Set set = ContactList.entrySet();
        Iterator<Map.Entry> itr = set.iterator();

        while (itr.hasNext())
        {
            Map.Entry temp = itr.next();
            System.out.println("Contact name is " + temp.getKey() +" and its mobile number is- " + temp.getValue());
        }
    }


    public static void main(String[] args)
    {

        HashMap<String,Integer> ContactList = new HashMap<>();
        ContactList.put("abc",1234567890);
        ContactList.put("bcd",1345678901);
        ContactList.put("cde",1456789012);
        ContactList.put("def",1567890123);
        ContactList.put("efg",1678901234);

        System.out.println(checkKey(ContactList,"abc"));
        System.out.println(checkKey(ContactList,"xyz"));

        // To check Values in the ContactList
        System.out.println(checkValue(ContactList,1234567890));
        System.out.println(checkValue(ContactList,1345678901));
        System.out.println(checkValue(ContactList,1876543210));

        // Printing all the contacts detail in the list
        printAll(ContactList);
    }
}
