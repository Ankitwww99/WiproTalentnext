package Map;

import java.util.*;

/*
Implement the assignment 1 using HashTable
 */
public class AssignmentMap6 {
    Hashtable<String,String> M1;

    public AssignmentMap6() {
        M1 = new Hashtable<>();
    }

    Hashtable<String,String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName,capital);
        return M1;
    }

    String getCapital(String CountryName) {
        Set set = M1.entrySet();
        Iterator<Map.Entry> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry temp = itr.next();
            if(temp.getKey().equals(CountryName))
                return (String) temp.getValue();
        }
        return null;
    }

    String getCountry(String capitalName) {
        Set set = M1.entrySet();
        Iterator<Map.Entry> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry temp = itr.next();
            if(temp.getValue().equals(capitalName))
                return (String) temp.getKey();
        }
        return null;
    }

    Hashtable<String,String> reverseHashtable() {
        Hashtable<String,String> reverseMap = new Hashtable<>();
        Set set = M1.entrySet();
        Iterator<Map.Entry> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry temp = itr.next();
            reverseMap.put((String)temp.getValue(), (String)temp.getKey());
        }

        return reverseMap;
    }

    ArrayList<String> createArrayList() {
        ArrayList<String> countryName = new ArrayList<>();

        Set set = M1.entrySet();
        Iterator<Map.Entry> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry temp = itr.next();
            countryName.add((String)temp.getKey());
        }
        return countryName;
    }

    public static void main(String[] args) {
        AssignmentMap6 object = new AssignmentMap6();
        object.saveCountryCapital("India","Delhi");
        Hashtable<String,String> m1 = object.saveCountryCapital("Japan","Tokyo");

        System.out.println("Content in map are:- ");
        Set s1 = m1.entrySet();
        Iterator<Map.Entry> itr1 = s1.iterator();
        while (itr1.hasNext()) {
            Map.Entry temp = itr1.next();
            System.out.println("Country is:- " + temp.getKey() + ", Capital is:- " + temp.getValue());
        }

        System.out.println(object.getCapital("India"));

        System.out.println(object.getCountry("Tokyo"));

        Hashtable<String,String> modifiedMap = object.reverseHashtable();
        System.out.println("Content in modified map are:- ");
        Set s2 = modifiedMap.entrySet();
        Iterator<Map.Entry> itr2 = s2.iterator();
        while (itr2.hasNext()) {
            Map.Entry temp = itr2.next();
            System.out.println("Capital is:- " + temp.getKey() + ", Country is:- " + temp.getValue());
        }

        ArrayList<String> countryName = object.createArrayList();
        System.out.println("Name of countries present in ArrayList are:- ");
        for (String country: countryName) {
            System.out.print(country+" ");
        }
        System.out.println();
    }
}
