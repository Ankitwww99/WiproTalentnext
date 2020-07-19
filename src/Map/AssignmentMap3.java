package Map;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
Write a program that will have a Properties class object which is capable of storing some States of India and their Capital.
Use an Iterator to list all the elements stored in the Properties.
 */
public class AssignmentMap3 {
    public static void main(String[] args)
    {
        Properties p = new Properties();

        p.put("UttarPradesh","Lucknow");
        p.put("Bihar","Patna");
        p.put("Maharashtra","Mumbai");
        p.put("Tamil Nadu","Chennai");
        p.put("Rajasthan","Jaipur");

        Set set = p.keySet();
        Iterator itr = set.iterator();

        while (itr.hasNext())
        {
            String str = (String) itr.next();
            System.out.println("The capital of "+ str + " is " + p.getProperty(str));
        }
    }
}
