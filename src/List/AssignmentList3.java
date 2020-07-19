package List;

import java.util.ArrayList;
import java.util.List;

/*
Create an ArrayList that can store only Strings.
Create a printAll method that will print all the elements of the ArrayList using an Iterator.
 */
public class AssignmentList3 {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("ankit");
        list.add("bharkha");
        list.add("chetan");
        list.add("deepak");
        list.add("eekta");
        printAll(list);
    }

    public static void printAll(List<String> list){
        for(String str: list){
            System.out.println(str);
        }
    }

}
