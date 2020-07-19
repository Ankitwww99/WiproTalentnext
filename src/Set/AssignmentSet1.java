package Set;

import java.util.HashSet;
import java.util.Iterator;

/*
Develop a java class with a instance variable H1 (HashSet)  add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.
NOTE: You can test the methods using a main method.
 */
class Country {
    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {
        Iterator<String> it = H1.iterator();

        while (it.hasNext()) {
            if (it.next().equals(CountryName))
                return CountryName;
        }

        return null;
    }
}
public class AssignmentSet1 {
    public static void main(String[] args) {
        Country countries = new Country();
        countries.saveCountryNames("India");
        countries.saveCountryNames("USA");
        countries.saveCountryNames("Pakistan");
        countries.saveCountryNames("Bangladesh");
        countries.saveCountryNames("China");

        System.out.println("China: " + countries.getCountry("China"));
        System.out.println("Japan: " + countries.getCountry("Japan"));
    }
}
