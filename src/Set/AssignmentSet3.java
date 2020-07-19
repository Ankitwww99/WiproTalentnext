package Set;

import java.util.Iterator;
import java.util.TreeSet;

/*
Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.
 */
public class AssignmentSet3 {
    void addName(TreeSet<String> t1, String Name)
    {
        t1.add(Name);
    }

    void printAll(TreeSet<String> t1)
    {
        Iterator<String> itr = t1.iterator();
        while (itr.hasNext())
        {
            String name = itr.next();
            System.out.print(name+" ");
        }
        System.out.println();
    }

    boolean getName(TreeSet<String> t1, String name)
    {
        Iterator<String> itr = t1.iterator();
        while (itr.hasNext())
        {
            String current_name = itr.next();
            if(current_name.equals(name))
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        AssignmentSet3 object = new AssignmentSet3();
        TreeSet<String> t1 = new TreeSet<>();


        object.addName(t1,"ankit");
        object.addName(t1,"bansal");
        object.addName(t1,"vikas");

        System.out.println("Elements before reversing");
        object.printAll(t1);


        t1 = (TreeSet<String>)t1.descendingSet();

        System.out.println("Elements after reversing");
        object.printAll(t1);


        System.out.println(object.getName(t1,"ankit"));
        System.out.println(object.getName(t1,"bansal"));
    }
}
