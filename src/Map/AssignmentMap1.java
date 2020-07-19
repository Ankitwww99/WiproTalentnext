package Map;
/*
1. Develop a java class with a instance variable M1 (HashMap)  create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country                          Value - Capital
India                                                   Delhi
Japan                                                Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital                    Value – Country
Delhi                                           India
Tokyo                                        Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.
 */
import java.util.*;

public class AssignmentMap1 {
    HashMap<String,String> M1;

    public AssignmentMap1() {
        M1 = new HashMap<>();
    }

    HashMap<String,String> saveCountryCapital(String CountryName, String capital) {
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

    HashMap<String,String> createAnotherMap() {
        HashMap<String,String> reverseMap = new HashMap<>();
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
        AssignmentMap1 object = new AssignmentMap1();
        object.saveCountryCapital("India","Delhi");
        HashMap<String,String> m1 = object.saveCountryCapital("Japan","Tokyo");

        System.out.println("Content in map are:- ");
        Set s1 = m1.entrySet();
        Iterator<Map.Entry> itr1 = s1.iterator();
        while (itr1.hasNext()) {
            Map.Entry temp = itr1.next();
            System.out.println("Country is:- " + temp.getKey() + ", Capital is:- " + temp.getValue());
        }

        System.out.println(object.getCapital("India"));

        System.out.println(object.getCountry("Tokyo"));

        HashMap<String,String> modifiedMap = object.createAnotherMap();
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
